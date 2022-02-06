package tests.day_19;

import org.testng.annotations.Test;
import pages.DemoQaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoQA {

    //1. “https://demoqa.com/webtables” sayfasina gidin
    //  2. Headers da bulunan department isimlerini yazdirin
    //  3. sutunun basligini yazdirin
    //  4. Tablodaki tum datalari yazdirin
    //  5. Tabloda kac cell (data) oldugunu yazdirin
    //  6. Tablodaki satir sayisini yazdirin
    //  7. Tablodaki sutun sayisini yazdirin
    //  8. Tablodaki 3.kolonu yazdirin
    //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

    @Test
    public void demoQaTesti (){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoQaUrl"));

        DemoQaPage demoQaPage = new DemoQaPage();

        //  2. Headers da bulunan department isimlerini yazdirin

        //  normlde //thead//th olurdu ancak bu tablo class isimleri ile organize edilmis

        System.out.print("2 - baslik satiri elementi : "+demoQaPage.baslikSatiriElementi.getText());

        // ikinci yontem olarak basliklari bir listeye koyabilirim
        // basliklarWebelementiListesi

        //  3. 3.sutunun basligini yazdirin

        System.out.println("3- 3.sutun basligi : "+demoQaPage.basliklarWebelementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("4- =============Tablodaki tüm Datalar===========Tum body==========");
        System.out.println(demoQaPage.bodyTekWebelement.getText());
        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("5 - Tablodaki data sayisi : "+demoQaPage.tumDataWebelementList.size());
        //  6. Tablodaki satir sayisini yazdirin
        System.out.println(" 6 -Tum satir sayisi : "+demoQaPage.tumSatirlarWebelementList.size());
        //  7. Tablodaki sutun sayisini yazdirin
        //     farkli yollardan hesaplanabilir ama biz hucre sayisi / satir sayisi yapalim
        System.out.println(" 7- tablodaki sutun sayisi : " +
                (demoQaPage.tumDataWebelementList.size()/demoQaPage.tumSatirlarWebelementList.size()));
        //  8. Tablodaki 3.kolonu yazdirin
        demoQaPage.sutunYazdir(2);


        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoQaPage.ismeGoreMaasYazdir("Kierra");


        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

        demoQaPage.hucreYazdir(3,2);


    }
        
    }


