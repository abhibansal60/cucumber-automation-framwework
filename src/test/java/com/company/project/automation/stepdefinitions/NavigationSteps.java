package com.company.project.automation.stepdefinitions;

import com.company.project.automation.pages.Base;
import io.cucumber.java8.En;
import org.junit.Assert;

public class NavigationSteps extends Base implements En {
    public NavigationSteps() {
        Given("^user has access to the application$", () -> {
            Assert.assertEquals("Google",fetchPageTitle());
        });
        When("^user opens \"([^\"]*)\"$", (String page) -> {
        });
        And("^click on \"([^\"]*)\"$", (String tab) -> {
        });
        Then("^page with \"([^\"]*)\" should be opened$", (String title) -> {
        });
    }
}
