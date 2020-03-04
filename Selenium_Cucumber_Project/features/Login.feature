
Feature: Login Feature

  @Smoke
  Scenario: User should be able to login into the application 
    Given User is at Home Page
    When User enters the "admin" and "admin"
    And User clicks on submit
    Then User should be navigated to home page

