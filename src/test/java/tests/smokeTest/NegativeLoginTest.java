package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    HotelMyCamp hotelMyCamp = new HotelMyCamp();

    @Test
    public void yanlisSifreTesti() {
        //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
        //3 Farkli test Methodunda 3 senaryoyu test et
        //                - yanlisSifre
        //                - yanlisKulllanici
        //                - yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://www.hotelmycamp.com adresine git
        //3) Login butonuna bas
        //4) Verilen senaryolar ile giris yapilamadigini test et

        Driver.getDriver().get(ConfigReader.getProperty("HotelMyCampUrl"));
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.usernameBox.sendKeys(ConfigReader.getProperty("HotelMyCampWrongUsername"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HotelMyCampWrongPassword"));
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlisUsernameTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HotelMyCampUrl"));
        hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.usernameBox.sendKeys(ConfigReader.getProperty("HotelMyCampWrongUsername"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HotelMyCampWrongPassword"));
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifreUsernameTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HotelMyCampUrl"));
        hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.usernameBox.sendKeys(ConfigReader.getProperty("HotelMyCampWrongUsername"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HotelMyCampWrongPassword"));
        hotelMyCamp.loginButonu.click();
        Assert.assertTrue(hotelMyCamp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
