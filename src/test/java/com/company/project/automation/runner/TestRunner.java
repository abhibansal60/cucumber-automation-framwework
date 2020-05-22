package com.company.project.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.company.project.automation.stepdefinitions",
        tags = "@BrowShot",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:test-output/json/cucumber-report.json",
                "pretty"},
        strict = true, monochrome = false)
public class TestRunner {

}
