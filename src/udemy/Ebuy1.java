package udemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Ebuy1 {
	public static SoftAssert sf;

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./st/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath("//footer[@id='glbfooter' and @class='gh-w']"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		 sf=new SoftAssert();

		
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			
			URL u = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setConnectTimeout(5000);
			conn.connect();
			if (conn.getResponseCode() >= 400) {
				System.out.println(url + "------>" + conn.getResponseMessage());

			} else {
				System.out.println(url+ "----->" + conn.getResponseCode());

			}	
			}

			
	}
			
}		
			
		

			/*HttpURLConnection  conn =(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int status=conn.getResponseCode();
			sf.assertTrue(status<400, "the link with  is broken with status code"+conn.getResponseMessage());
		    
		}
	sf.assertAll();

		}
			
		}

*/			

		
		

