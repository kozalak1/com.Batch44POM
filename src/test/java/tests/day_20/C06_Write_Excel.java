package tests.day_20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_Write_Excel {

    public void testWritingTheExcel () throws IOException {

        String path = "src/main/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis); // workbook a aldıgımız excel orjinali değil bir kopyası



    }


}
