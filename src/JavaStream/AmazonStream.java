package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonStream {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// excuding blank space links which dont have text and then fetching th links with starts with Amzon
		
		
		List<String>linktext=links.stream().filter(ele->   !ele.getText().equals("") && ele.getText().startsWith("Amazon"))
		.map(ele->ele.getText()).collect(Collectors.toList());
		linktext.forEach(ele-> System.out.println(ele));
		
		System.out.println("--------------------------------------------");
		//second way
		List<String>linktext1=links.stream().filter(ele->   !ele.getText().isEmpty())
				.filter(ele->ele.getText().startsWith(""))
				.map(ele->ele.getText().trim()).collect(Collectors.toList());
				linktext1.forEach(ele-> System.out.println(ele));
				
				
		
		
		
		
		
		
		
		
		
		


}
}