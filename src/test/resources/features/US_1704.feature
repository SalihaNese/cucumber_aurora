@us1704
  Feature: US_0017 My Order page visibility test on Dashboard page

    Scenario: TC_1704 Verification of the number of products on the order page
      Given Open browser go to url "myUrl"
      Then  User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks My Order section on dashbord page
      Then  User verifies that all the options of the dropdown menu of the number of products can be determined
      Then Closes the page