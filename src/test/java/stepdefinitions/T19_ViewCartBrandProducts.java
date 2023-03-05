package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllProductsPage;
import utilities.Driver;
/*
  Ve Markaların sol taraftaki çubukta göründüğünü doğrulayın
  Ve Herhangi bir marka adına tıklayın
  Ve Kullanıcının marka sayfasına yönlendirildiğini
  ve marka ürünlerinin görüntülendiğini doğrulayın
  Ve Sol taraftaki çubukta başka herhangi bir marka bağlantısını tıklayın
  Ardından Kullanıcının o sayfaya gittiğini doğrulayın marka sayfası ve ürünleri görebilir
 */

public class T19_ViewCartBrandProducts {
    AllProductsPage allProductsPage=new AllProductsPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(allProductsPage.textBransdProducts.isDisplayed());
    }

    @And("Click on any brand name")
    public void clickOnAnyBrandName() {
        Driver.wait(2);
        allProductsPage.buttonBrandProductsPolo.click();
    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Polo"));
        Driver.wait(2);
        Assert.assertTrue(allProductsPage.textBrandPoloProducts.isDisplayed());
    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        allProductsPage.buttonBrandProductsHM.click();
        Driver.wait(2);

    }

    @Then("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("H&M"));
        Driver.wait(2);
        Assert.assertTrue(allProductsPage.textBrandHMProducts.isDisplayed());
    }
}
