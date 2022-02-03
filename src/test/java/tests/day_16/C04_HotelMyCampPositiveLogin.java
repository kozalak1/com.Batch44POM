package tests.day_16;

import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {
    // 1 ) Bir Class olustur : PositiveTest
    //2-bir test method olustur positiveLoginTest()
    //        https://www.hotelmycamp.com/ adresine git
    //        login butonuna bas
    //    test data username: manager ,
    //    test data password : Manager1!
    //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void test01 () {
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCamp hotelMyCamp = new HotelMyCamp();
        hotelMyCamp.ilkLoginLinki.click();
        hotelMyCamp.usernameBox.sendKeys("manager");
        hotelMyCamp.passwordBox.sendKeys("Manager1!");
        hotelMyCamp.loginButonu.click();

    }
}
