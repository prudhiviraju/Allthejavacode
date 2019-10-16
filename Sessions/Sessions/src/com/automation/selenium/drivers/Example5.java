package com.automation.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to open Opera browser and navigate required URL and then close browser*/
class Example5 {

	public static void main(String[] args){

		WebDriver driver = null;
		try {
			System.setProperty("webdriver.opera.driver", ApplicationConstants.OPERA_DRIVER);
			
			OperaOptions options = new OperaOptions();
			
			options.setBinary("C:\\Program Files\\Opera\\53.0.2907.68\\opera.exe");
			
			driver = new OperaDriver(options);

			driver.get("https://twitter.com/");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}
	}

}



