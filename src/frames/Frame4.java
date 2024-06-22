package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame4 {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./sws/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		driver.manage().window().maximize();
	    WebElement frame1 = driver.findElement(By.xpath(" //iframe[@class='w-full h-96']"))	;
	    driver.switchTo().frame(frame1);
		WebElement txt1 = driver.findElement(By.xpath("//p[@class='para'][1]"));
		String v1 = txt1.getText();
		
	     WebElement txt2= driver.findElement(By.xpath("//p[@class='para'][2]"));
		 String v2 = txt2.getText();
		
		 WebElement txt3 = driver.findElement(By.xpath("//p[@class='para'][3]"));
		 String v3 = txt3.getText();
		
		// WebElement loginframe = driver.findElement(By.xpath("//iframe"));//this is by address
	     driver.switchTo().frame(0);//this is by index nested frame
		
		 WebElement emailframe = driver.findElement(By.xpath("(//iframe)[1]"));
		 driver.switchTo().frame(emailframe);
		 WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		 email.sendKeys(v1);
		
		 driver.switchTo().parentFrame();


		WebElement pwdframe= driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(pwdframe);
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(v2);
		
		driver.switchTo().parentFrame();
		
	    WebElement cnpwdframe= driver.findElement(By.xpath("(//iframe)[3]"));
		driver.switchTo().frame(cnpwdframe);
		WebElement cn = driver.findElement(By.xpath("//input[@name='confirm']"));
		cn.sendKeys(v3);
		
	




		
		

		
		

	
	
		
		
		

		
		
		

		
		

	}
}
