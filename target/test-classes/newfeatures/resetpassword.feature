#Author: anandsharma
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
# (Comments)
#Sample Feature Definition Template
Feature: Reset password page actions

  Scenario: Verify contents on reset password page
    Given User launches qaclick academy website
    When User is on reset password page
    Then Reset password page heading is displayed as "WebServices Testing using SoapUI"
    And Reset main section heading is displayed as "Reset Password1"
    And Email field label and textbox is displayed
    And Send Me Instruction button is displayed
    And Log In with school Account button is displayed
    And Create an Account button is displayed

  @smoke
  Scenario: click on login button on menu bar from reset password page
    Given User launches qaclick academy website
    When User is on reset password page
    And User clicks on login button from reset page
    Then User is redirected to login page from reset page

  Scenario Outline: click on some buttons has no action
    Given User launches qaclick academy website
    When User is on reset password page
    And User clicks on <button> button on reset page menubar
    Then User remains on same page

    Examples: 
      | button                       |
      | My Courses                   |
      | All Courss                   |
      | Create an account            |
      | Log in with a school account |

  Scenario: User attempts to reset password with invalid email
    Given User launches qaclick academy website
    When User is on reset password page
    And User enters invalid email "invalid@gmail.com"
    And User clicks on Send me Instructions button
    Then Email box is reset, user remains in same page

  @smoke
  Scenario: User attempts to reset password with valid email
    Given User launches qaclick academy website
    When User is on reset password page
    And User enters valid email "valid@gmail.com"
    And User clicks on Send me Instructions button
    #Then "sent" message displayed
