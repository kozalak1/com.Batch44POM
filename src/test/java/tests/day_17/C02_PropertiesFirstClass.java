package tests.day_17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesFirstClass {

    @Test
    public void positiveLoginTest01 (){
        //https://www. hotelmycamp.com/ adresine git
        //login butonuna bas
        //test data username: manager ,
        //test data password : Manager1!
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Driver.getDriver().get(ConfigReader.getProperty("HotelMyCampUrl"));
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.ilkLoginLinki.click();

        hotelMyCamp.usernameBox.sendKeys("HotelMyCampValidUsername");
        hotelMyCamp.passwordBox.sendKeys("HotelMyCampValidPassword");
        hotelMyCamp.loginButonu.click();

        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());

    }
}
