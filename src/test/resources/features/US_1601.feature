


@us1601
Feature: US_1601 Purchase history visibility test

  Scenario: Verification the Purchase Hıstory page

    Given Open browser go to url "myUrl"
    Then  User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
    Then  User clicks on dashboard link
    Then User clicks Purchase History section on dashbord page
    Then User verifies that Purchase History page is accessible
    Then Closes the page