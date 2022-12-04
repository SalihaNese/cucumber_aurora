package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Then("Kullanici amazon arama kutusunda {string} arama yapar")
    public void kullanici_amazon_arama_kutusunda_arama_yapar(String istenenKelimeleri) {
        amazonPage.amazonAramaKutusu.sendKeys(istenenKelimeleri + Keys.ENTER);

    }
    @Then("Kullanici arattıgı {string} test eder")
    public void kullanici_arattıgı_test_eder(String testKelimeleri) {
        Assert.assertTrue(amazonPage.amazonAramaSonucuTest.getText().contains(testKelimeleri));


    }
}
