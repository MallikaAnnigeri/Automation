package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbc {
	
	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/Automation";
		String usn="root";
		String psw="root";
		Connection connet = DriverManager.getConnection(url, usn, psw);
		Statement stmt = connet.createStatement();
		ResultSet res = stmt.executeQuery("select * from credentials");
		res.next();
		String usn1=res.getString("usn");
		String pwd1=res.getString("pwd");
		
		System.setProperty("webdriver.chrome.driver","./sf/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(usn1);
		driver.findElement(By.id("pass")).sendKeys(pwd1);
	
		
		
		
	}

}
