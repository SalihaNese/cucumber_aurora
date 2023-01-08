
@us1705
Feature: US_0017 My Order page visibility test on Dashboard page

  Scenario: TC_1705  Verification of transitions between pages (by prev-next) on the order page

    Given Open browser go to url "myUrl"
    Then  User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
    Then  User clicks on dashboard link
    Then  User clicks My Order section on dashbord page
    Then  User goes to bottom of the page
    Then  User clicks next and or previous buttons
    And   Closes the page