package com.automation.coreJava.inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* This example shows how to implement inheritance concept*/
class TestScript00 {

	private WebDriver driver = null;
	
	public WebDriver launchBrowser(String browserName){
		if(browserName.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	public void createAccount(){
		driver = launchBrowser("CHROME");
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		driver.quit();
	}
	
	public static void main(String[] args) {
		TestScript00 script00 = new TestScript00();
		script00.createAccount();
	}

}
