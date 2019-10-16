package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.Newpropertycode;

public class Propertyfileusing {
	
	
	
	
	@Test
	public  void main() {
	Newpropertycode nw = new Newpropertycode();	
	System.setProperty("webdriver.chrome.driver", nw.getchromepath());	
	WebDriver driver = new FirefoxDriver();	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
	
	driver.get(nw.geturl());
	driver.findElement(By.id("username")).sendKeys(nw.getusername());
	driver.findElement(By.name("pwd")).sendKeys(nw.getpwd());
	driver.findElement(By.id("loginButton")).click();
	
	
	}
	

}
