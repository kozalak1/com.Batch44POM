package tests.day_19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCamp;

public class C02_WebTableDynamicLocate {
    //3 test method'u olusturalim
    //1.method : satir numarasi verdiginde bana o satirdaki datalari yazdirsin
    //2.method : satir no ve data numarasi girdigimde verdigim datayi yazdirsin
    //3.method : sutun numarasi verdigimde bana tum sutunu yazdirsin

    HMCWebTablePage hmcWebTablePage;

    @Test
    public  void satirYazdirTesti (){

       hmcWebTablePage = new HMCWebTablePage();

        WebElement ucuncuSatirElementi = hmcWebTablePage.satirGetir(3);

        System.out.println(ucuncuSatirElementi.getText());

    }


    public void hucreGetirTesti (){


    }

}
