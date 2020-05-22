@BrowShot
Feature: Browshot API tests

  Background: User Authentication
    Given user has a valid api token

  @BasicSanity
  Scenario: Fetch basic user details
    When user access their account info
    Then user info should be validated

