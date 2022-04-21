package Class32;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xlsx=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xlsx.getSheet("Sheet1");
        //System.out.println(xlsx.getSheetIndex("Sheet1"));
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(1);
        System.out.print(sheet.getRow(0).getCell(0)+" ");
        System.out.println(sheet.getRow(0).getCell(1));


        System.out.print(sheet.getRow(1).getCell(0)+" ");
        System.out.println(sheet.getRow(1).getCell(1));

        System.out.print(sheet.getRow(2).getCell(0)+" ");
        System.out.println(sheet.getRow(2).getCell(1));


    }
}