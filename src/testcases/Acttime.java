package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author prudhivi R@zz
 * Acttime practice session
 */

public class Acttime {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/civicon/\r\n");
		driver.findElement(By.id("username")).sendKeys("prudhiviraju73@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("YpasUMER");
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		driver.quit();
				
		
		
		
		
	}
	
	
}
