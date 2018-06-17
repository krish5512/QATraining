package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TatocLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\krk55\\Desktop\\chrome\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("http://10.0.1.86/tatoc/basic/windows");
	       driver.findElement(By.linkText("Launch Popup Window")).click();
	       driver.findElement(By.id("name")).sendKeys("Krishna");
	       driver.findElement(By.linkText("Submit")).click();	         
	 	   driver.findElement(By.linkText("Proceed")).click();

	}

}
