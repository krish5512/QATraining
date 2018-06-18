package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TatocLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prkrishnakumar\\eclipse-workspace\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
	       driver.get("http://10.0.1.86/tatoc/basic/windows");
	       String parentHandle = driver.getWindowHandle(); // get the current window handle
	       driver.findElement(By.linkText("Launch Popup Window")).click();
	       for (String winHandle : driver.getWindowHandles()) { 
	           driver.switchTo().window(winHandle);        // switch focus of WebDriver to the next found window handle (that's your newly opened window)              
	       }
	       driver.findElement(By.id("name")).sendKeys("Krishna");
	       driver.findElement(By.id("submit")).click();	     
	       driver.switchTo().window(parentHandle);         // switch back to the original window
	 	   driver.findElement(By.linkText("Proceed")).click();

	}

}
