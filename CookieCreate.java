package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prkrishnakumar\\eclipse-workspace\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
	       driver.get("http://10.0.1.86/tatoc/basic/cookie");
	       driver.findElement(By.linkText("Generate Token")).click();
	       String token = driver.findElement(By.id("token")).getText();
	       System.out.println(token);
	       String[] splitStr = token.split("\\s+");
	       System.out.println(splitStr[1]);
	       Cookie name = new Cookie("Token",splitStr[1]);
           driver.manage().addCookie(name);
           driver.findElement(By.linkText("Proceed")).click();
	}

}
