#Author: anandsharma
Feature: Login in actions with different set of creds

  Scenario: Verify login page header and footer messages
    Given User launches qaclick academy website
    And User clicks on login button
    When User is on login page
    Then Header message is displayed as "WebServices Testing using SoapUI"
    And Footer message is displayed as "WebServices Testing using SoapUI"

  Scenario: Verify login-page main section contents
    Given User launches qaclick academy website
    And User clicks on login button
    When User is on login page
    Then Login main section heading is displayed as "Log In to WebServices Testing using SoapUI"
    And Email field is displayed
    And Password field is displayed
    And LogIn button is displayed

  @smoke
  Scenario Outline: User logs in to the website with invalid credentials
    Given User launches qaclick academy website
    And User clicks on login button
    Then User is redirected to login page
    When user enter invalid <username> and <password>
    And User clicks on Login button on login page
    Then <errormessage> message is displayed

    Examples: 
      | username    | password    | errormessage |
      | validname   | invalid pwd | message      |
      | invalidname | valid pwd   | message      |

  @smoke
  Scenario: User logs in with valid credentials
    Given User launches qaclick academy website
    And User clicks on login button
    Then User is redirected to login page
    When User enters valid "username" and valid "password"
    And User clicks on Login button on login page
    Then User is logged into the website

  @smoke
  Scenario: Click on forgot password button
    Given User launches qaclick academy website
    And User clicks on login button
    Then User is redirected to login page
    When User clicks on forgot password button
    Then User is redirected to reset password page
    And Email field is displayed on reset password page
    And reset password page title is "WebServices Testing using SoapUI"
