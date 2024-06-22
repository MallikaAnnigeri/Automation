package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("songs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		WebElement video=driver.findElement(By.xpath("//a[@href='/watch?v=Bd8bpV2pxak&pp=ygUFc29uZ3M%3D']"));
	    video.click();
	    Thread.sleep(2000);
	   driver.findElement(By.xpath("//like-button-view-model[@class='YtLikeButtonViewModelHost']")).click();
	}

}
