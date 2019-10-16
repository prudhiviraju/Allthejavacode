package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.Screenshot;

@Test



public class Googlescreeenshot {

 	
	public void screenshot() throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\freecrmtest\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    Screenshot.capturescreenshot(driver,"ass");
    driver.quit();
	}
	 
	
	
	
}
