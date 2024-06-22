package selenium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Dell/Desktop/Facebook/Dropdown.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
		Select s = new Select(dd);
		List<WebElement> opts = s.getOptions();
		int count = opts.size();
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			WebElement opt = opts.get(i);
			String text = opt.getText();
			arr.add(text);

		}
		Collections.sort(arr, Collections.reverseOrder());

		for (String ar : arr) {
			System.out.println(ar);
		}

	}
}