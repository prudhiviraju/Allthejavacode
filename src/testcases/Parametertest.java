package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Screenshot;





public class Parametertest {

	WebDriver driver;
	
	
	@Test
	@Parameters({"url","firstname"})	
	public void facebooklogin(String url , String firstname) {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\freecrmtest\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("u_0_l")).sendKeys(firstname);
	    Screenshot.capturescreenshot(driver,"testcase");
		driver.quit();
		
		
		
		
		
		
		
		
	}
	
	
}
