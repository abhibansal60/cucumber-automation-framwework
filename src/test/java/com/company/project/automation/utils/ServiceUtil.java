package com.company.project.automation.utils;

import com.company.project.automation.world.ServiceWorld;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ServiceUtil {
    @Autowired
    ServiceWorld sw;

    public String getAPIToken(){
        return sw.getBrowShotApiToken();
    }

    private Map<String,String> getHeaders(){
        Map<String,String> myMap = new HashMap<>();
        myMap.put("Accept","application/json; charset=utf-8");
        return myMap;
    }

    public Response getRequest(String endPoint, String... paramsList){
        if(paramsList.length%2!=0) throw new IllegalArgumentException("invalid query params!");
        Map<String,String> paramsMap= new HashMap<>();
        for(int param=0;param<paramsList.length-1;param+=2){
            paramsMap.put(paramsList[param],paramsList[param+1]);
        }
        Response response=RestAssured
                                .given()
                                .headers(getHeaders())
                                .queryParam("key",getAPIToken())
                                .queryParams(paramsMap)
                                .when()
                                .log().all()
                                .get(sw.getBaseURL())
                                .then()
                                .statusCode(200)
                                //.contentType(ContentType.ANY)
                                .extract().response();
        return response;
    }

    public Response postapi(){
    return null;
    }
}
