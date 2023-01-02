@us1602
  Feature: US_0016 All History dropdown menu on Purchase History page is enabled test

    Scenario: TC_1602 Verification of All History dropdown menu on Purchase History page

      Given Open browser go to url "myUrl"
      Then User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
      Then User clicks on dashboard link
      Then User clicks Purchase History section on dashbord page
      Then User clicks All History dropdown menu on Purchase History page
      Then User verifies All History option on All History dropdown menu is displayed
      Then User verifies Pending Orders option on All History dropdown menu is displayed
      Then User verifies Confirmed Orders option on All History dropdown menu is displayed
      Then User verifies Completed Orders option on All History dropdown menu is displayed
      Then User verifies Refused Cancelled Orders option on All History dropdown menu is displayed
      And Closes the page