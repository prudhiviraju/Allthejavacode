package testcases.checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertin {
	
	WebDriver driver;
	
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Latest Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.applypanonline.com");
		driver.findElement(By.xpath("//a[@id='navmenu-2']")).click();
		
		WebElement noinco= driver.findElement(By.xpath("//input[@id='chkincome']"));
		
		
		noinco.click();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(noinco.isSelected(),true);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
