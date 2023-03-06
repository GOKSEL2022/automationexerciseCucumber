package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",   //stepdefinitions path
        tags ="@AddReviewOnProduct",   //"@personel_olusturma and
        //tags = "@ViewCartBrandProducts",     //sendKeys(Keys.F5);==> sayfayı refresh eden kısayol
        dryRun = false

)
public class Runner {

}
