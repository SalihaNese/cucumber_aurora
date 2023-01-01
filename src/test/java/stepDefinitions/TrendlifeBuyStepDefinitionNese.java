package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TrendlifebuyPageNese;
import utilites.Driver;
import utilites.ReusableMethods;

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
}
