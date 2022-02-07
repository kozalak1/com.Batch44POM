package tests.day_20;

import org.testng.annotations.Test;

public class C05_Exceli_Mape_Yukleme {

    @Test
    public void test04 (){
        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi = "Sayfa1";


        ReusableMethods.mapOlustur(path, sayfaAdi);




    }

}
