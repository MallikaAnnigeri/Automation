package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteData {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		FileInputStream fs=new FileInputStream("C://Users//Dell//Desktop//Flipkart.xlsx");
		Workbook book=WorkbookFactory.create(fs);
		Sheet sh = book.createSheet("Flipkart_links");
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String lnk = link.getAttribute("href");
		    Row rw = sh.createRow(i);
		    Cell cl = rw.createCell(0);
		    cl.setCellValue(lnk);
		        
		}
		FileOutputStream fos = new FileOutputStream("C://Users//Dell//Desktop//Flipkart.xlsx");
		book.write(fos);
	}

}
