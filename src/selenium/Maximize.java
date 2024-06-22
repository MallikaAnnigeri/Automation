package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F11);
		r.keyRelease(KeyEvent.VK_F11);
		
		Thread.sleep(2000);
		
		  r.keyPress(KeyEvent.VK_WINDOWS);
          r.keyPress(KeyEvent.VK_DOWN);
          r.keyRelease(KeyEvent.VK_DOWN);
          r.keyRelease(KeyEvent.VK_WINDOWS);
          
          
          Thread.sleep(2000);
          
          r.keyPress(KeyEvent.VK_CONTROL);
          r.keyPress(KeyEvent.VK_W);
          r.keyRelease(KeyEvent.VK_W);
         r.keyRelease(KeyEvent.VK_CONTROL);
		


}
}