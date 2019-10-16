package com.automation.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use back,forward and refresh the browser */
class Example2 {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.applypanonline.com/");

			Thread.sleep(2000);

			driver.navigate().to("http://newtours.demoaut.com/");

			Thread.sleep(3000);

			driver.navigate().back();

			Thread.sleep(3000);

			driver.navigate().forward();

			Thread.sleep(3000);

			driver.navigate().refresh();

			Thread.sleep(3000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}
}
