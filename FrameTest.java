package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\prkrishnakumar\\eclipse-workspace\\chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
	       driver.get("http://10.0.1.86/tatoc/basic/frame/dungeon");
//WebElement mainElement = driver.findElement(By.id("main"));
driver.switchTo().frame("main");
String original = driver.findElement(By.id("answer")).getAttribute("class");
Boolean condi = true;
while(condi)
{
	//WebElement childElement = driver.findElement(By.id("child"));
	driver.switchTo().frame("child");
	String newAnswer = driver.findElement(By.id("answer")).getAttribute("class");
	driver.switchTo().parentFrame();
	if(original.equals(newAnswer))
	{
		condi = false;
	}	
	else
	{
		driver.findElement(By.linkText("Repaint Box 2")).click();
	}
}
driver.findElement(By.linkText("Proceed")).click();

	}

}
