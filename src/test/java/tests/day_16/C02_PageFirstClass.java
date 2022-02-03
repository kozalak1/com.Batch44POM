package tests.day_16;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageFirstClass {

    @Test
    public void driverAmazonTest () {
        Driver.getDriver().get("https://www.amazon.com");
        //WebElement searcBoxElement =
        AmazonPage amazonPage = new AmazonPage();

    }

    public void driverAmazonTest2 (){


    }
}
