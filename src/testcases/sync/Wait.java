package testcases.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wait {

	
	WebDriver driver;
	@BeforeTest
	public void before() {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Admin\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Latest Drivers\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
	}
	@Test
	public void test() {
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_q")).sendKeys("R@zz");
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='u_0_s']")));
		driver.findElement(By.xpath("//input[@id='u_0_s']")).sendKeys("8331900166");
		driver.quit();
		
		
	}
	
	
}
