package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.OrderPlacedPage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class T24_DownloadInvoiceAfterPurchaseOrderStepDefinition {
    OrderPlacedPage orderPlacedPage = new OrderPlacedPage();

    @And("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        orderPlacedPage.buttonDownloadInvoice.click();

//        Dosyanın başarıyla indirilip indirilmediğini test edelim
        String filePath = System.getProperty("user.home") +"\\Downloads\\invoice.txt";
        boolean indirildimi = Files.exists(Paths.get(filePath));
        Assert.assertTrue(indirildimi);


    }
}