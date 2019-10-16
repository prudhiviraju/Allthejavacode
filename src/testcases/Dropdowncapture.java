package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdowncapture {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
	}
}
