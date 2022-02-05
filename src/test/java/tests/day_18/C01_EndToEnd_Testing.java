package tests.day_18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.Driver;

public class C01_EndToEnd_Testing {
    @Test
    public void createHotel () {
            //1. Tests packagenin altına class olusturun: CreateHotel
            //2. Bir metod olusturun: createHotel
            //3. https://www.hotelmycamp.com adresine git.

            //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri    girin.
            //	a. Username : manager
            //	b. Password  : Manager1!
            //5. Login butonuna tıklayın.

            HotelMyCamp hotelMyCamp = new HotelMyCamp();
            hotelMyCamp.girisYap();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
            hotelMyCamp.bekle(3);
            hotelMyCamp.hotelManagementLinki.click();
            hotelMyCamp.hotelListLinki.click();
            hotelMyCamp.addHotelLinki.click();
            //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
            Actions actions=new Actions(Driver.getDriver());
            Faker faker=new Faker();
            actions.click(hotelMyCamp.addHotelCodeKutusu)
                    .sendKeys(faker.address().zipCode())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.name().name())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.address().fullAddress())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.phoneNumber().cellPhone())
                    .sendKeys(Keys.TAB)
                    .sendKeys(faker.internet().emailAddress())
                    .sendKeys(Keys.PAGE_DOWN)
                    .perform();
            Select select=new Select(hotelMyCamp.addHotelDropdown);
            select.selectByVisibleText("Hotel Type1");

            //8. Save butonuna tıklayın.
            hotelMyCamp.bekle(1);
            // hotelMyCampPage.addHotelSaveButonu.click();


            //9. “Hotel was inserted successfully” textinin göründüğünü test edin.


            //10. OK butonuna tıklayın.


        }
}
