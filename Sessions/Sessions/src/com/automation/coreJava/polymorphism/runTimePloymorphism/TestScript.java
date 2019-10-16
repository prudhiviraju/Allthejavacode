package com.automation.coreJava.polymorphism.runTimePloymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* This example shows how to implement overriding concept*/

class TestScript extends FrameworkScript {

	private WebDriver driver = null;

	public WebDriver launchBrowser(String browserName){
		
		switch (browserName.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
				driver = new ChromeDriver();
				break;
			case "FF":
				System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
				driver = new FirefoxDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
				driver = new InternetExplorerDriver();
				break;
			case "SAFARI":
				System.setProperty("webdriver.safari.driver", ApplicationConstants.SAFARI_DRIVER);
				driver = new SafariDriver();
				break;	
		}
		return driver;
	}

	public void createAccount() {
		driver = launchBrowser("CHROME");
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		driver.close();
	}

	public static void main(String[] args) {
		TestScript script = new TestScript();
		script.createAccount();
	}

}
