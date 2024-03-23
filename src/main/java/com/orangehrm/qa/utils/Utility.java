package com.orangehrm.qa.utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utility {
    public static int ImplicitWait =10;
    public static int PageLoadTimeout =20;
    public static String TESTDATA_SHEET_PATH = "src/testdata/OrangeHRMTestData.xlsx";
    static Workbook book;
    static Sheet sheet;

    public static Object[][] getTestData(String sheetname){
        FileInputStream file = null;

        try{
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }
        try{
            book = WorkbookFactory.create(file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetname);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int r=0;r<sheet.getLastRowNum();r++){
            for(int c=0;c<sheet.getRow(0).getLastCellNum();c++){
                data[r][c] = sheet.getRow(r+1).getCell(c).toString();
            }
        }
        return data;
    }

}
