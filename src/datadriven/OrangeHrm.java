package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait w=new WebDriverWait(driver,10);
		WebElement usn = driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(usn));
		usn.sendKeys("Admin");
		
		  WebElement pwd = driver.findElement(By.name("password"));
			w.until(ExpectedConditions.visibilityOf(pwd));
			pwd.sendKeys("admin123");

		  WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		  w.until(ExpectedConditions.visibilityOf(submit));
		  submit.click();

		
			WebElement button = driver.findElement(By.xpath("(//a)[3]"));
			w.until(ExpectedConditions.visibilityOf(button));
			button.click();
			
			WebElement tab = driver.findElement(By.xpath("//a[text()='Add Employee']"));
			  w.until(ExpectedConditions.visibilityOf(tab));
			  tab.click();
			  
				WebElement fn = driver.findElement(By.name("firstName"));
				FileInputStream fs=new FileInputStream("C://Users//Dell//Desktop//orange.xlsx");
				Workbook book=WorkbookFactory.create(fs);
				Sheet sheet = book.getSheet("orange");
				Row rw = sheet.getRow(0);
				Cell cl = rw.getCell(0);
				String value1 = cl.getStringCellValue();
				fn.sendKeys(value1);
				
				WebElement mn = driver.findElement(By.name("middleName"));
				Row rw1 = sheet.getRow(1);
				Cell cl1 = rw1.getCell(0);
				String value2 = cl1.getStringCellValue();
				mn.sendKeys(value2);
				
				
				WebElement ln = driver.findElement(By.name("lastName"));
				Row rw2 = sheet.getRow(2);
				Cell cl2 = rw2.getCell(0);
				String value3= cl2.getStringCellValue();
				ln.sendKeys(value3);
				
				WebElement sm = driver.findElement(By.xpath(" //button[@type='submit']"));
				sm.click();




                 

	}

}
