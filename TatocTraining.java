package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TatocTraining {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\krk55\\Desktop\\chrome\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
       driver.findElement(By.className("greenbox")).click();
       driver.quit();
	}

}
