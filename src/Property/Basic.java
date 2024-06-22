package Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic {

	@Test
	public void login() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement usn = driver.findElement(By.id("email"));

		WebElement pws = driver.findElement(By.name("pass"));
		WebElement lgn = driver.findElement(By.name("login"));

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./Test_property/TestData.properties");
		p.load(fis);
		String f1 = p.getProperty("usn");
		String f2 = p.getProperty("pwd");
		usn.sendKeys(f1);
		pws.sendKeys(f2);

	}

}
