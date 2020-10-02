#Author: Anand Kumar (AnandK29)
Feature: Landing page and actions on it

  @smoke
  Scenario: launch site and validate title
    Given User launches qaclick academy website
    When site opens on landing page
    Then Landing page title is "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"

  Scenario: Verify all options on tool bar
    Given User launches qaclick academy website
    When User is on home page
    Then Verify phone number and mail id are visible on tool bar
    And Register and Login button are visible on tool bar

  @smoke
  Scenario: Navigate to Register page
    Given User launches qaclick academy website
    When User is on home page
    And Register button is displayed
    When User clicks on register button
    Then User is redirected to registration page
    And signup page title is "Rahul Shetty Academy"

  @smoke
  Scenario: Navigate to Login page
    Given User launches qaclick academy website
    When User is on home page
    And Home page LogIn button is displayed
    When User clicks on login button
    Then User is redirected to login page
    And login page title is "Webservices Testing using SoapUI"

  Scenario: Click Rahul Shetty Academy logo
    Given User launches qaclick academy website
    When User is on home page
    When Rahul Shetty Academys logo is displayed
    And User click on the logo
    Then User is redirected to Rahul Shetty Academy home page
    And RSA page title is "Rahul Shetty Academy"

  Scenario: Navigate to Practice page
    Given User launches qaclick academy website
    When User is on home page
    And Practice button is displayed
    When User clicks on practice button
    Then user is redirected to practice page

  @smoke
  Scenario Outline: Click on Menu bar buttons
    Given User launches qaclick academy website
    When User is on home page
    Then All menu bar buttons are displayed and enabled
    When User clicks on <buttons> button on landing page menubar
    Then User is redirected to Rahul Shetty Academy home page

    Examples: 
      | buttons         |
      | HOME            |
      | COURSES         |
      | VIDEOS          |
      | BLOG            |
      | ABOUT           |
      | CONTACT         |
      | INTERVIEW GUIDE |

  Scenario: Validate Featured image, video wrapper and page heading are Displayed on Header section
    Given User launches qaclick academy website
    When User is on home page
    Then Featured image is displayed in header section
    And Heading text is displayed
    And Video wrapper is displayed and clickable
    And Marquee strip is displayed

  Scenario: Validate course section contents
    Given User launches qaclick academy website
    When User is on home page
    Then Course section title is displayed as "FEATURED COURSES"
    And Total ten featured courses are displayed

  @smoke
  Scenario: Validate Top course is featured section
    Given User launches qaclick academy website
    When User is on home page
    Then Featured courses are displayed
    And "Selenium Webdriver with Java Basics" is first course in the list

  @smoke
  Scenario: Click on view courses button
    Given User launches qaclick academy website
    When User is on home page
    Then View all Courses button is displayed
    When User clicks on View All Courses button
    Then User is redirected to Rahul Shetty Academy home page

  Scenario Outline: Welcome panel options are displayed
    Given User launches qaclick academy website
    When User is on home page
    And User scrolls down to bottom of the page
    Then <title> is displayed at index <i> and description contains <message>

    Examples: 
      | title                                   | i | message                                                                                 |
      | SELF PACED ONLINE TRAINING              | 1 | You can access the videos on 24* 7 for Life time                                        |
      | IN DEPTH MATERIAL                       | 2 | Top class material designed on all courses                                              |
      | LIFE TIME INSTRUCTOR SUPPORT            | 3 | We are happy to help you on any query in the course you are enrolled in                 |
      | RESUME PREPARTION & INTERVIEW QUESTIONS | 4 | We will help you in preparing the resume and provide good number of Interview questions |
      | 30 DAY MONEY BACK GUARANTEE             | 5 | contact us in the first 30 days and we will give you a full refund                      |
