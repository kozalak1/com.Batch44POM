package tests.day_20;

import org.testng.Assert;

public class C03_ReusableRunner {


    public void test03 (){

    // Ulkeler excelindeki, Sayfa1'de
    // 11.index'deki satirin, 2.indexdeki hucresinin Azerbaycan oldugunu test edin

    String path="src/test/java/resources/ulkeler.xlsx";
    String expectedData="Azerbaycan";
    String actualData=ReusableMethods.hucreGetir(path,"Sayfa1",11,2).toString();
    Assert.assertEquals(actualData,expectedData);
}

}
