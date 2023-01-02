@us1701

Feature: US_0017 My Order page visibility test on Dashboard page

    Scenario: TC_1701 Verification of My Order page

      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Order section on dashbord page
      Then  User verifies that My Order page is accessible
      And  Closes the page