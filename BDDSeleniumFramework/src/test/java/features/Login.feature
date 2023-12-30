
Feature: Application Login
  Background:
    Given setup the entries in database
    When launch the browser from config variables
    And hit the home page url of banking site

  @RegressionTest
  Scenario: Admin page default login
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home page is displayed
    And Cards are displayed

    #Reusable
  @RegressionTest
  Scenario: User page default login
    Given User is on NetBanking landing page
    When User login into application with "user" and password 0953
    Then Home page is displayed
    And Cards are displayed

    #Reusable hardcoding
  @SmokeTest @RegressionTest
  Scenario Outline: User page default login
    Given User is on NetBanking landing page
    When User login into application with "<username>" and password "<password>"
    Then Home page is displayed
    And Cards are displayed

    Examples:
      | username   | password |
      | debituser  | hello12  |
      | credituser | hell1    |

    #Reusable
  @SmokeTest
  Scenario: User page default Sign up
    Given User is on Practice landing page
    When User Sign up into application
      | ivan           |
      | chacon         |
      | ivan@gmail.com |
      | 2233           |
    Then Home page is displayed
    And Cards are displayed