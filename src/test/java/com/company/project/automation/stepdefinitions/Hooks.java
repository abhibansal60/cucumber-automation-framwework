package com.company.project.automation.stepdefinitions;

import com.company.project.automation.config.ServiceConfig;
import com.company.project.automation.setup.DriverManager;
import com.company.project.automation.world.ResourceWorld;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {ServiceConfig.class})
public class Hooks {
    @Autowired
    DriverManager dm;
    @Autowired
    ResourceWorld rw;
    @Before
    public void beforeScenario(){
        if(!System.getProperty("type").equalsIgnoreCase("api"))
            dm.getDriver().get(rw.getBaseURL());
    }
    @After
    public void tearDown(){
        if(!System.getProperty("type").equalsIgnoreCase("api"))
            dm.closeBrowser();
    }
}
