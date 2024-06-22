package udemy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAmazon {

	public static void broken(String UrlLink)

	{
		try {
			URL u = new URL(UrlLink);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setConnectTimeout(5000);
			conn.connect();
			if (conn.getResponseCode() >= 400) {
				System.out.println(UrlLink + "------>" + conn.getResponseMessage());

			} else {
				System.out.println(UrlLink + "----->" + conn.getResponseCode());

			}

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sf/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			broken(url);

		}
		driver.quit();

	}

}