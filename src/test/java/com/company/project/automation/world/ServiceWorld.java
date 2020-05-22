package com.company.project.automation.world;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class ServiceWorld {

    @Value("${browshot.api.token}")
    String browShotApiToken;
    @Value("${api.base.url}")
    String baseURL;
    @Value("${account.info}")
    String accInfo;

    public String getBrowShotApiToken() {
         if(browShotApiToken==null) {
             throw new IllegalArgumentException("API Token not found!");
         }
         else return browShotApiToken;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public String getAccInfo() {
        return accInfo;
    }
}
