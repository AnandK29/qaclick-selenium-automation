**Automation QAClick Academy website**<br>
A simple automation project created with java, selenium, maven, cucumber and testng to demostrate effective use of cucumber-framework for testng/junit test cases.

##Table of contents
* [Introduction](#introduction)
* [Technology](#technology)
* [Prerequisites](#prerequisites)
* [Setup](#setup)
* [Limitations](#limitations)
* [Endnote](#endnote)

...
<a name="introduction">
## Introduction
</a>

If you are new in learning selenium(or any automation technology) certainly you would have come across 'qaclickacademy.com'.
This project demonstrates the automation of the website using cucumber with selenium.
Demos how we can effectively have both testng and junit test cases in single project and run/execute them as per requirement.

...
<a name="introduction">
## Technology
</a>

This project is created using-
* Java version: 1.8.0_221
* Selenium version: 3.141.59
* TestNg version: 7.0.0
* Junit version: 4.13
* Cucumber version: 6.6.0
<br>Cucumber-java, cucumber-core, cucumber-gherkin, cucumber-testng, cucumber-junit

...
<a name="prerequisites">
## Prerequisites
</a>

Install java 1.8 or above in your system and set `JAVA_HOME` and path variables in environment variables.<br>
Install Maven and set `MAVEN_HOME` and path variable in environment varibales. <br>
Download relevant drivers viz. chromeDriver, geckodriver etc.

...
<a name="setup">
## SetUp
</a>

Clone the project in appropriate location. <br>
Open *globalProperties.properties* file and update location to set *chromeDiverPath* and *firefoxDriverPath* properties to respective paths on your local system. <br>
To execute with Junit Runner uncomment the **@After** method in *StepDefinitions/CommonSteps.java* class.
Disable it before executing testng test.<br>
Update `username` and `password` fields in feature files under respective scenario before you run the test. <br>
e.g.

```
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
```
 
Above code block is from *login.feature* file. As you can see the test data for all fields are mocked. So, you need to update them with real data before you run the test.

...
<a name="limitations">
## Limitations
</a>

1. To execute test cases of only a particular page (say home page or signup page ) modification if *stepDefinitions* file will be needed.
2. Requires JRE 1.7 or above to support the execution. Code will not compile on versions below 1.7 due switch-case uses.
3. POM.xml not configured to run smoke and regression tests independently.
4. No 3rd party reporting is added.
5. Test is configured to runs only on *chrome* and *firefox* driver.

...
<a name="endnote">
## Endnote
</a>

* Screenshots for failed test cases get saved in *QAclick/target/Screenshots* folder.
* Sure-fire plugin is added in pom.xml so as to enable command line execution with 'maven'.
* Same set of test scenarios can be executed as `Junit` or `testng` test by running *testRunner/JunitRunner.java* and *testngcucumber.xml* respectively.
* Find surefire-reports at *target/surefire-reports* folder. Look for *index.html*  file and open it on the browser.
* Find testng reports in *test-output* folder. Look for *index.html*  file and open it on the browser.

...
