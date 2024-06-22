package Testngg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvider2 {
	
	@DataProvider(name="TestData")
	
	public String[][] data() throws Exception
	{
	FileInputStream fs=new FileInputStream("./Excel/Book4.xlsx");
	Workbook book=WorkbookFactory.create(fs);
	Sheet sheet = book.getSheet("Sheet1");
   String usn1 = sheet.getRow(0).getCell(0).getStringCellValue();
   String pwd1 = sheet.getRow(0).getCell(1).getStringCellValue();
   String usn2 = sheet.getRow(1).getCell(0).getStringCellValue();
   String pwd2 = sheet.getRow(1).getCell(1).getStringCellValue();
   
   String[][] d1=new String[2][2];
   d1[0][0]=usn1;
   d1[0][1]=pwd1;
   d1[1][0]=usn2;
   d1[1][1]=pwd2;
   
   return d1;
   
	}
	

}
