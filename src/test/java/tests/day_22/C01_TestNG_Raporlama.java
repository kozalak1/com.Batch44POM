package tests.day_22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRaporlama;

import java.io.IOException;

public class C01_TestNG_Raporlama extends TestBaseRaporlama {

    @Test
    public void windowHandlereusableTest() throws IOException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();
    }
}
