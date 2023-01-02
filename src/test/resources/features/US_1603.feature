
@us1603

  Feature: US_0016 Buttons on the Action column on the Purchase History page is enabled test

    Scenario: TC_1603 Verification the order summaries and the order invoice from
    the Actions column in the Purchase History list on the Purchase History page.

      Given Open browser go to url "myUrl"
      Then   User clicks on the login link, enters "mailNese" and "passwordNese" and logs in.
      Then  User clicks on dashboard link
      Then  User clicks Purchase History section on dashbord page
      Then  User clicks the buttons in the action column of any order to see the order summary or to download order invoice
      And Closes the page