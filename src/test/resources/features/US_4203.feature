
  @us4203
    Feature: US_0043 Testing to check the stock status of the products on the site

      Scenario: TC_4203 Verification of the stock list of the selected products when the Type is selected

      Given Open browser go to url "AdminUrl"
      Then  Admin enters an "email", a "password", then clicks sign in link on admin page to login
      Then  Admin clicks Admin Reports section from sidebar menu on dashboard page
      Then  Admin clicks Product stock section
      Then  Admin clicks Type dropdown menu
      Then  Admin clicks Select One
      Then  Admin clicks Search button
      Then  Admin verifies that the stock list of the selected products is displayed
      Then  Admin clicks All Product List button
        Then Admin clicks Search button
      Then  Admin verifies that the stock list of the selected products is displayed
        And   Closes the page

