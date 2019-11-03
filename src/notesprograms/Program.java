package notesprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Program {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Desktop\\\\\\"
				+ "\\Selenium\\\\\\\\Latest Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.goibibo.com");
		
		WebElement ob =driver.findElement(By.id("student_fare_check"));
		Thread.sleep(5000);
		
		ob.click();
		
		Thread.sleep(3000);
		ob.click();
		
		System.out.println(ob.isEnabled());
		driver.quit();
		
		
		
		
		
	}
	
	
}
