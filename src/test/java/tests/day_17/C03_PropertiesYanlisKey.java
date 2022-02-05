package tests.day_17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_PropertiesYanlisKey {

    @Test
     public  void negativeLoginTest01 (){
        Driver.getDriver().get(ConfigReader.getProperty("HotelCampUrl"));
        // eger key olarak girdigimiz String configuration.properties dosyasinda yoksa;
        // Ornegin : HotelMyCampUrl yerine HotelCampUrl yazarsak,
        // ConfigReader.getProperty() o key'i bulamaz ve aşağıdaki hatayı fırlatır :

        //java.lang.NullPointerException: null value in entry: url=null
     }

}
