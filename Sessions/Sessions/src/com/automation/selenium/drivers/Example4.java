package com.automation.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to open Microsoft Edge browser and navigate required URL and then close browser*/
class Example4 {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.edge.driver", ApplicationConstants.EDGE_DRIVER);
			
			driver = new EdgeDriver();

			driver.get("https://www.bmw.in/en/index.html");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.close();
		}

	}

}

