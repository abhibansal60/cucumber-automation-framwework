@UI
Feature: Sanity tasks for the app
  Background: Common steps before every scenario in the feature
    Given user has access to the application

  Scenario Outline: Validate user can open a tab on a page
    When user opens "<page>"
    And click on "<tab>"
    Then page with "<title>" should be opened
    Examples:
    |page|tab|title|
    |page1|tab|title|


