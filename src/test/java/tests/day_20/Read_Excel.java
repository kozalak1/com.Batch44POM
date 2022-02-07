package tests.day_20;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_Excel {

        @Test
        public void testExcel () throws IOException {

        String path = "src/main/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path); // ya dosyayı okuyamazsam dedi, exception attık

        Workbook workbook = WorkbookFactory.create(fis); // exception verdi, atadık
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(4);
        Cell cell = row.getCell(2);

        System.out.println(cell.toString());
}

}
