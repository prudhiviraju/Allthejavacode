package com.automation.coreJava.polymorphism.runTimePloymorphism;

/* This example shows how to implement overriding concept*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

class FrameworkScript {
	
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

}
