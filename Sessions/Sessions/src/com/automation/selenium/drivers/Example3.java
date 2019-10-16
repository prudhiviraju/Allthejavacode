package com.automation.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to open Internet Explorer browser and navigate required URL and then close browser*/
class Example3 {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
			
			driver = new InternetExplorerDriver();

			driver.get("http://www.audi.in/in/web/en.html");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}

}
