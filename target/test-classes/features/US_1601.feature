


@us1601
Feature: US_0016 Purchase History visibility test on Dashboard page

  Scenario: TC_1601 Verification of the Purchase History page

    Given Open browser go to url "myUrl"
    Then  User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
    Then  User clicks on dashboard link
    Then User clicks Purchase History section on dashbord page
    Then User verifies that Purchase History page is accessible
    Then Closes the page