package tests.day_20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_Write_Excel {

    // ulkeler exceline 5.sutun olarak NUFUS sutunu ekleyelim
    // 3.satirdaki ulkenin nufusunu 1000000 yapalim

    @Test
    public void testWritingTheExcel () throws IOException {

        String path = "src/main/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);

     // 2- class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim
        Workbook workbook = WorkbookFactory.create(fis); // workbook a aldıgımız excel orjinali değil bir kopyası

// 3- dosyada yapmak istedigimiz degisiklikleri
        //    kopya workbook'da yapalim
        // ilk satirin 5.hucresine NUFUS basligini yazdiralim


        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");


        // // 3.satirdaki ulkenin nufusunu 1000000 yapalim

        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");


        // 4- kopyada yaptigimiz degisiklikleri ana dosyaya kaydedelim

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);


    }

    }



