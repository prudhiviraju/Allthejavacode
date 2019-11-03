package notesprograms;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
		driver.get("https://www.facebook.com");
		
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.alertIsPresent());
		org.openqa.selenium.Alert alr =driver.switchTo().alert();
		alr.dismiss();
		
		
		
		
	}
	
}
