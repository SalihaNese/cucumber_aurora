@us4202
  Feature: US_0042 Testing to check the stock status of the products on the site

    Scenario: TC_4202 Verification of Select One or All Product List

        Given Open browser go to url "adminUrl"
        Then  Admin enters an "neseAdminEmail", a "neseadminPassword", then clicks sign in link on admin page to login
        Then  Admin clicks Admin Reports section from sidebar menu on dashboard page
        Then  Admin clicks Product stock section
        Then  Admin clicks Type dropdown menu
        Then  Admin verifies that Select One is selectable
        Then  Admin verifies that All Product List is selectable
        And   Closes the page
