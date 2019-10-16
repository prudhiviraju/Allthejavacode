package com.automation.frameworks.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automation.frameworks.utils.Logger;
import com.automation.frameworks.utils.Reporter;
import com.automation.selenium.utils.ApplicationConstants;

public class FrameworkScript {

	protected WebDriver driver = null;
	
	@BeforeTest
	protected void onInitialize() {
		Logger.info("onInitialize");
		try {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			Logger.error(exception.getMessage());
		}

	}
		
	@AfterTest
	protected void onTerminate() {
		Logger.info("onTerminate");
		try {
			driver.close();
			Reporter.endScript();
		} catch (Exception exception) {
			Logger.error(exception.getMessage());
		}
	}

}
