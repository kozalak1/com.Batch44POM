package tests.day_16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_DriverFirstTest {

    @Test
    public void driverAmazonTest (){
        Driver.getDriver().get("https://www.amazon.com");
        String actualTitle = Driver.getDriver().getTitle();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));

    }

    @Test
    public void driverBestbuyTest(){
        // bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");


        // bestbuy'a gittigimizi test edelim

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}
