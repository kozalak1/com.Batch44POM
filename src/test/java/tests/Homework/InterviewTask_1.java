package tests.Homework;

import org.testng.annotations.Test;

public class InterviewTask_1 {
    //https://www.chanel.com/us/
    //1st test:
    //    1- Accessing the site --> OK if the site is displayed
    //    2- Click on the search bar (on the top menu)
    //    3- Search for "ROUGE ALLURE"
    //    3- Check if the items of the displayed list contain the searched word
    //    4- Select the second item of the list
    //    5- Make sure that the displayed product name is the same as the previously selected name.

    //2nd test:
    //    1- Access to the site
    //    2- Access to Makeup => Lipstick category (on top menu)
    //    3- Click on ROUGE ALLURE product
    //    4- Add the product to the cart
    //    5- View Cart --> OK, if there is a "ROUGE ALLURE" product in the cart, the quantity=1 and the total cart is equal to the product price.


    @Test
    public void test01() throws InterruptedException {

        driver.get("https://www.chanel.com/us/");
        Thread.sleep(3000);

        WebElement baslik=driver.findElement(By.xpath("//img[@class='logo_header']"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(baslik.isEnabled(),"Siteye giris yapılamadi");

        driver.findElement(By.xpath("(//button[@title='Search'])[2]")).click();
        Thread.sleep(3000);

        WebElement arama Kutusu=driver.findElement(By.xpath("//input[@id='searchInput']"));
        String aramaKutusu="ROUGE ALLURE";
        aramaKutusu.sendKeys(aramaKutusu+ Keys.ENTER);
        Thread.sleep(3000);

        List<WebElement> liste=driver.findElements(By.className("product-list-inline__link"));
        for(WebElement w: liste){
            softAssert.assertTrue(w.getText().contains(searchedWord),"Listede ismi ROUGE ALLURE içermeyen urun var");
        }

        WebElement ikinci=driver.findElement(By.xpath("(//a[@class='product-list-inline__link'])[2]"));
        String ikinciText=ikinci.getText();
        System.out.println(ikinciText);
        ikinci.click();
        Thread.sleep(3000);

        String productName=driver.findElement(By.xpath("//span[@class='heading product-details__title ']")).getText();
        softAssert.assertEquals(ikinciText,productName);
​
    }
​
    @Test
    public void test02() throws InterruptedException {

        driver.get("https://www.chanel.com/us/");

        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.xpath("//span[@data-test='lnkAxisCategory_makeup']")).click();
        Thread.sleep(3000);
        WebElement lipstick=driver.findElement(By.xpath("//a[@data-event-label='lipstick']"));
        lipstick.click();

        WebElement rogueAllure=driver.findElement(By.xpath("//span[@data-test='imgPdouct_AxisSearchResultPage_151138']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",rogueAllureProduct);
        jse.executeScript("arguments[0].click()",rogueAllureProduct);

        driver.findElement(By.id("pos-cnc-btn")).click();

        boolean nameTest=driver.findElement(By.xpath("//span[@data-test='lblProductTitle_151138']")).getText().contains("ROUGE ALLURE");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(nameTest);
        boolean quantityTest=driver.findElement(By.xpath("//p[@data-test='lblProductQty_151138']")).getText().contains("1");
        softAssert.assertTrue(quantityTest);
        String totalPrice=driver.findElement(By.xpath("//p[@data-test='lblSubTotal_Price']")).getText();
        String price=driver.findElement(By.xpath("//p[@data-test='lblProductPrice_151138']")).getText();
        softAssert.assertEquals(price,totalPrice);
    }
}
