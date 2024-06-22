package datadriven;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DataDriven {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fs=new FileInputStream("./Excel/Book1.xlsx");
		Workbook book=WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("Sheet1");
		Row rw = sheet.getRow(0);
		Cell cl = rw.getCell(0);
		String value=cl.getStringCellValue();
		System.out.println(value);
		
	}

}
