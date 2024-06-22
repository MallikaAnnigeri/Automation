package JavaStream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//1 way
		// links.forEach(ele->System.out.println(ele.getText()));

		// in the above code we are getting some spaces bcz some of the links does have text
		// to exclude that spaces we use we convert the list into stream then apply filter
		 
		 //2 way
		 
		List<String> links1 = links.stream().filter(ele -> !ele.getText().equals(""))
				.map(ele -> ele.getText())
				.collect(Collectors.toList());
		links1.forEach(System.out::println);
		System.out.println("----------------------------------");
		//this for getting first link from the list of links
		
		  String text=links.stream().filter(ele-> !ele.getText().equals(""))
		  .findFirst().get().getText(); System.out.println(text);
		 
		
		
		  System.out.println("------------------------------------------");
		  
		  
		  //findany 
		  String text2=links.stream().filter(ele-> !ele.getText().equals(""))
		  .findAny().get().getText(); System.out.println(text2);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
