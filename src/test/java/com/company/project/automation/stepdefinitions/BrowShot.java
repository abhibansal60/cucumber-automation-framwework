package com.company.project.automation.stepdefinitions;

import com.company.project.automation.utils.ServiceUtil;
import com.company.project.automation.world.ServiceWorld;
import io.cucumber.java8.En;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class BrowShot implements En {
    @Autowired
    ServiceUtil su;
    @Autowired
    ServiceWorld sw;
    public BrowShot() {
        Given("^user has a valid api token$", () -> {
            Assert.assertEquals("Invalid API token",24,su.getAPIToken().length());
        });
        When("^user access their account info$", () -> {
            System.out.println(su.getRequest(sw.getAccInfo(),"details","1"));
        });
        Then("^user info should be validated$", () -> {
        });
    }
}
