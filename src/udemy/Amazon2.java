package udemy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./soft/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("mobile phones", Keys.ENTER);

		List<WebElement> product = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		String[] itemsNeeded = { "Samsung", "Moto","OnePlus" };

		List<String> item = Arrays.asList(itemsNeeded);// converting array into ArrayList
		for (int i = 0; i < product.size(); i++) {
			String value = product.get(i).getText();
			String v1 = value.split(" ")[0];
			System.out.println(v1);

			if (item.contains(v1)) {
				driver.findElements(By.xpath("//i[@class='a-icon a-icon-cart']/following-sibling::button")).get(i).click();
				Thread.sleep(2000);

			}

		}

	}
}