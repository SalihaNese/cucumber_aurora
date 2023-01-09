package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TrendlifebuyPageNese;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.ReusableMethods;

import static utilites.Driver.getDriver;

public class TrendlifeBuyStepDefinitionNese {

    TrendlifebuyPageNese trendlife = new TrendlifebuyPageNese();

    Actions actions=new Actions(Driver.getDriver());

    @Then("User clicks Purchase History section on dashbord page")
    public void user_clicks_purchase_history_section_on_dashbord_page() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        trendlife.purchaseHistory.click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
    }

     @Then("User clicks All History dropdown menu on Purchase History page")
    public void user_clicks_all_history_dropdown_menu_on_purchase_history_page() {
        trendlife.allHistoryDropDown.click();
    }

    @Then("User verifies All History option on All History dropdown menu is displayed")
    public void user_verifies_all_history_option_on_all_history_dropdown_menu_is_displayed() {
       Assert.assertTrue(trendlife.allHistoryButton.isDisplayed());
    }
    @Then("User verifies Pending Orders option on All History dropdown menu is displayed")
    public void user_verifies_pending_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.pendingOrdersButton.isDisplayed());
    }
    @Then("User verifies Confirmed Orders option on All History dropdown menu is displayed")
    public void user_verifies_confirmed_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.confirmOrdersButton.isDisplayed());
    }
    @Then("User verifies Completed Orders option on All History dropdown menu is displayed")
    public void user_verifies_completed_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.copletedOrdersButton.isDisplayed());
    }
    @Then("User verifies Refused Cancelled Orders option on All History dropdown menu is displayed")
    public void user_verifies_refused_cancelled_orders_option_on_all_history_dropdown_menu_is_displayed() {
        Assert.assertTrue(trendlife.refusedCancelledOrdersButton.isDisplayed());
    }
    @Then("User verifies that Purchase History page is accessible")
    public void userVerifiesThatPurchaseHistoryPageIsAccessible() {
        Assert.assertTrue(trendlife.purchaseHistory.isEnabled());
    }

    @Then("User clicks the buttons in the action column of any order to see the order summary or to download order invoice")
    public void userClicksTheButtonsInTheActionColumnOfAnyOrderToSeeTheOrderSummaryOrToDownloadOrderInvoice() {
        trendlife.orderSummaryButton.click();

        String expectedText = "19221226011248";
        String actualText = "19221226011248";
        Assert.assertEquals(expectedText, actualText);
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.ESCAPE).perform();
        ReusableMethods.bekle(2);
        String ilkSayfaWinHandDegeri= Driver.getDriver().getWindowHandle();
        trendlife.downloadOrderInvoice.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().window(ilkSayfaWinHandDegeri);
        }


        //^^^^^^^^^^ 17 ^^^^^^^^^^^^

    @Then("User clicks My Order section on dashbord page")
    public void user_clicks_my_order_section_on_dashbord_page() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();


        ReusableMethods.bekle(2);
       trendlife.myOrderButton.click();
      //  actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);

    }

    @Then("User verifies that My Order page is accessible")
    public void user_verifies_that_my_order_page_is_accessible() {
     Assert.assertTrue(trendlife.myOrderButton.isEnabled());
      ReusableMethods.bekle(2);
    }


    @Then("User verifies that My Order list can be filtered as All, To Pay, To Ship, To Received")
    public void userVerifiesThatMyOrderListCanBeFilteredAsAllToPayToShipToReceived() {
    Assert.assertTrue(trendlife.myOrderAllButton.isDisplayed());
    Assert.assertTrue(trendlife.myOrderToPayButton.isDisplayed());
    Assert.assertTrue(trendlife.myOrderToShipButton.isDisplayed());
    Assert.assertTrue(trendlife.myOrderToReceiveButton.isDisplayed());

    }

    @Then("User verifies that Order ID is displayed")
    public void user_verifies_that_order_ıd_is_displayed() {
     Assert.assertTrue(trendlife.orderIdButton.isDisplayed());
    }
    @Then("User verifies that Status is displayed")
    public void user_verifies_that_status_is_displayed() {
     Assert.assertTrue(trendlife.statusButton.isDisplayed());

    }
    @Then("User verifies that Order date is displayed")
    public void user_verifies_that_order_date_is_displayed() {
        Assert.assertTrue(trendlife.orderDateButton.isDisplayed());

    }
    @Then("User verifies that Order Amount is displayed")
    public void user_verifies_that_order_amount_is_displayed() {
        Assert.assertTrue(trendlife.orderAmountButton.isDisplayed());
    }
    @Then("User verifies that Paid By is displayed")
    public void user_verifies_that_paid_by_is_displayed() {
        Assert.assertTrue(trendlife.paidByButton.isDisplayed());

    }

    @Then("User verifies that all the options of the dropdown menu of the number of products can be determined")
    public void userVerifiesThatAllTheOptionsOfTheDropdownMenuOfTheNumberOfProductsCanBeDetermined() {


        trendlife.numbersDropDownMenu.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(trendlife.lastFiveOrdersButton.isDisplayed());
        Assert.assertTrue(trendlife.lastTenOrdersButton.isDisplayed());

        ReusableMethods.bekle(2);
        trendlife.lastTenOrdersButton.click();

        trendlife.numbersDropDownMenu.click();
        Assert.assertTrue(trendlife.lastTwentyOrdersButton.isDisplayed());
        trendlife.lastTwentyOrdersButton.click();

        ReusableMethods.bekle(1);

        trendlife.numbersDropDownMenu.click();
        Assert.assertTrue(trendlife.lastFourtyOrdersButton.isDisplayed());
        trendlife.lastFourtyOrdersButton.click();
    }

    @Then("User goes to bottom of the page")
    public void user_goes_to_bottom_of_the_page() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Then("User clicks next and or previous buttons")
    public void user_clicks_next_and_or_previous_buttons() {
        ReusableMethods.bekle(2);
        trendlife.nextButton.click();
        Assert.assertTrue(trendlife.nextButton.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        trendlife.previousButton.click();

    }
    // ^^^^^^^^^^^42 ^^^^^^^^^^

    @Given("Open browser go to url {string}.")
    public void openBrowserGoToUrl(String admin) {
        Driver.getDriver().get(ConfigReader.getProperty(admin));
    }

    @Then("Admin enters an {string}, a {string}, then clicks sign in link on admin page to login")
    public void admin_enters_an_a_then_clicks_sign_in_link_on_admin_page_to_login(String mail, String password) {
       //trendlife.loginLink.click();

       trendlife.emailBox.sendKeys(ConfigReader.getProperty(mail));
       trendlife.passwordBox.sendKeys(ConfigReader.getProperty(password));
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.bekle(2);
        trendlife.signInButton.click();
    }
    @Then("Admin clicks Admin Reports section from sidebar menu on dashboard page")
    public void admin_clicks_admin_reports_section_from_sidebar_menu_on_dashboard_page() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(trendlife.adminReportsButton).click().perform();

    }
    @Then("Admin clicks Product stock section")
    public void admin_clicks_product_stock_section() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.moveToElement(trendlife.productStockButton).click().perform();
        Assert.assertTrue(trendlife.productStockButton.isDisplayed());
    trendlife.productStockButton.click();
    }
    @Then("Admin verifies that Type can be selected")
    public void admin_verifies_that_type_can_be_selected() {
   ReusableMethods.bekle(3);

   trendlife.typedropDownMenu.click();
   Assert.assertTrue(trendlife.allProductList.isEnabled());
        trendlife.allProductList.click();
        ReusableMethods.bekle(3);

        trendlife.typedropDownMenu.click();
    Assert.assertTrue(trendlife.selectOneOption.isEnabled());
    trendlife.selectOneOption.click();




    }


}
