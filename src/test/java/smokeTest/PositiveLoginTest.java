package smokeTest;

import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
            //1) com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()
    //         https://www.hotelmycamp.com adresine git
    //        login butonuna bas
    //test data username: manager ,
    //test data password : Manager1!
    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    public void positiveLoginTest () {
        Driver.getDriver().get(ConfigReader.getProperty("HotelMyCampUrl"));
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.usernameBox.sendKeys(ConfigReader.getProperty("HotelMyCampValidUsername"));
        hotelMyCamp.passwordBox.sendKeys(ConfigReader.getProperty("HotelMyCampValidPassword"));
        hotelMyCamp.loginButonu.click();


    }

}
