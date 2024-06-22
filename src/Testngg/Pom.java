package Testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	//Declaration
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement pws;

	@FindBy(name="login")
	private WebElement lgn;
	
	
	//initalization
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	  
	
	//utilization 
	public  void enterUsn(String us)
	{
		usn.sendKeys(us);
	}
	
	public  void enterpwd(String pwd)
	{
		pws.sendKeys(pwd);
	}
	
	
	
	
	
	public  void clickLogin()
	{
		lgn.click();
	}
	
	
	
	
	
	
	
	
	
	

}
