package com.automation.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to open firefox browser and navigate required URL and then close browser*/
class Example2 {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
			
			driver = new FirefoxDriver();

			driver.get("https://www.facebook.com/");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.close();
		}

	}

}
