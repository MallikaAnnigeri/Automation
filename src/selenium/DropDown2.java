package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Dell/Desktop/Facebook/Dropdown.html");
		Thread.sleep(2000);
	    WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));
	    Select s=new Select(dd);
	   List<WebElement> opts = s.getOptions();
	  int count = opts.size();
	  ArrayList<String> arr=new ArrayList<>();
	  for(int i=0;i<count;i++)
	  {
		 WebElement opt = opts.get(i);
		String text= opt.getText();
		arr.add(text);
		
	  }
	  for(String ar:arr)
	  {
		 System.out.println(ar) ;
	  }
	 System.out.println( arr.contains("INDIA"));
	  arr.remove("JAPAN");
	  System.out.println(arr);

}
}