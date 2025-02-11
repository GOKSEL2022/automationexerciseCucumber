package stepdefinitions;
import io.cucumber.java.en.*;
import pages.AllPages;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.Assert.assertTrue;
public class T24_DownloadInvoiceAfterPurchaseOrderStepDefinition {
    AllPages allPages=new AllPages();
    @And("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        allPages.orderPlacedPage().buttonDownloadInvoice.click();
//        Dosyanın başarıyla indirilip indirilmediğini test edelim
        String filePath = System.getProperty("user.home") +"\\Downloads\\invoice.txt";
        boolean indirildimi = Files.exists(Paths.get(filePath));
        assertTrue(indirildimi);
    }
}