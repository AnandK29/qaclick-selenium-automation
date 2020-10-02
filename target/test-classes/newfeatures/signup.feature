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
## (Comments)
#Sample Feature Definition Template
Feature: Sign up page actions

  Scenario: Click on the RSA logo
    Given User launches qaclick academy website
    When User is on register page
    And User clicks on the logo
    Then User is redirected to RSA home page

  Scenario: Verify all fields on register page are displayed
    Given User launches qaclick academy website
    When User is on register page
    Then RSA logo is displayed on top
    And Main content heading is displayed as "Sign Up to Rahul Shetty Academy"
    And Email field label and text box displayed
    And Password field label and text box displayed
    And Sign Up button is displayed

  @smoke
  Scenario Outline: User sign up with invalid data
    Given User launches qaclick academy website
    When User is on register page
    And User enters invalid <fullName> <email> <password> <confirmPwd>
    And User clicks on terms checkbox
    And Clicks on Sign up button
    Then <errormessage> message is displayed

    Examples: 
      | fullName | email         | password  | confirmPwd  | errormessage |
      | name     | user1_valid   | password1 | nonmatching | message      |
      | name     | user1_invalid | password1 | password1   | message      |

  @smoke
  Scenario Outline: User signs up with valid data but terms and services check box not selected
    Given User launches qaclick academy website
    When User is on register page
    And User enters valid details <fullName> <email> <password> <confirmPwd>
    And Clicks on Sign up button
    Then <errormessage> message is displayed

    Examples: 
      | fullName   | email       | password  | confirmPwd | errormessage |
      | validname1 | validemail1 | validpwd1 | validpwd1  | message      |
      | validname2 | validemail2 | validpwd2 | validpwd2  | message      |

  @smoke
  Scenario Outline: User signs up with valid data and agrees to selects terms and services
    Given User launches qaclick academy website
    When User is on register page
    And User enters valid details <fullName> <email> <password> <confirmPwd>
    And User clicks on terms checkbox
    And Clicks on Sign up button
    Then <successmessage> message is displayed

    Examples: 
      | fullName   | email       | password  | confirmPwd | successmessage |
      | validname1 | validemail1 | validpwd1 | validpwd1  | message        |
      | validname2 | validemail2 | validpwd2 | validpwd2  | message        |

  Scenario: Click on Terms of Use link button
    Given User launches qaclick academy website
    When User is on register page
    And User click on Terms of Use link
    Then User redirected to new page
    And Terms and services content is displayed

  @smoke
  Scenario: Click on privacy policy link button
    Given User launches qaclick academy website
    When User is on register page
    And User click on Privacy Policy link
    Then User redirected to new page
    And Privacy policy content is displayed
