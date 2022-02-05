package tests.day_16;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageFirstClass {

    //Page Object Model'de farkli class'lara farkli sekillerde ulasilmasi benimsenmistir
    // Utilities altındaki Driver class'i icin static yontemi kullanirken;
    // pages altındaki Class'lara ise obje uzerinden ulaşılması tercih edilmistir

    @Test
    public void driverAmazonTest () {
        Driver.getDriver().get("https://www.amazon.com");
        // arama kutusuna Nutella yazip aratalim

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //sonuclarinin Nutella icerdigini test edelim

        String actualSonuclar=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonuclar.contains("Nutella"));


    }
    @Test
    public void driverAmazonTest2 (){
        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //java icin arama yapalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java" + Keys.ENTER);
        // sonucun java icerdigini test edelim
        String actualSonuclar = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonuclar.contains("java"));

    }
}
