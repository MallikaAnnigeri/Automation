package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven2 {
public static void main(String[] args) throws Exception {
	
		FileInputStream fs=new FileInputStream("./Excel/Book2.xlsx");
		Workbook book=WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("Sheet1");
		Row rw = sheet.createRow(0);
		Cell cl = rw.createCell(0);
		cl.setCellValue("Advance");
		FileOutputStream fos=new FileOutputStream("./Excel/Book2.xlsx");
		book.write(fos);
		
		
		

}
}
