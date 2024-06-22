package Testngg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner  extends GenericTestCase
{
	
	@Test
	public  void LoginToFacebook() throws InterruptedException
	{
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Mallika");
		driver.findElement(By.id("pass")).sendKeys("Mallika123");

		driver.findElement(By.name("login")).click();

		
	}

}
