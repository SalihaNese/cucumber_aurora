@us4201
Feature: US_0042 Testing to check the stock status of the products on the site

  Scenario: TC_4201 Verification of  the Type  on product stock

      Given Open browser go to url "adminUrl".
      Then  Admin enters an "neseAdminEmail", a "neseadminPassword", then clicks sign in link on admin page to login
      Then Admin clicks Admin Reports section from sidebar menu on dashboard page
      Then Admin clicks Product stock section
      Then Admin verifies that Type can be selected
      Then Closes the page
