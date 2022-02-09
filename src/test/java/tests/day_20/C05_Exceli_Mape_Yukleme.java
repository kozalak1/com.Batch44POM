package tests.day_20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_Exceli_Mape_Yukleme {

    @Test
    public void test01(){
        // dosya yolu ve sayfa ismi verilen bie excel sheet'i map olarak kaydeden
        // reusable bir method olusturalim
        // burada excel'i oldugu gibi Map'in içine alarak istediğimiz işlemleri yapabiliriz

        String path="src/main/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        Map<String,String> ulkelerMap= ReusableMethodsInExcel.mapOlustur(path,sayfaAdi);


        // olusturdugumuz map'i kullanarak Turkey'in bilgilerini yazdirin

        System.out.println(ulkelerMap.get("Turkey"));

        // Listede Netherlands oldugunu testedin

        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));

    }

}
