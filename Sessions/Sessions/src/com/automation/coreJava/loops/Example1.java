package com.automation.coreJava.loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* Example to show how to use for statement */
class Example1 {

	public static void main(String[] args) throws Exception{

		int counter = 2;
		int index = 1;
		for (; index <= counter;) {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.quit();
			index++;
		}
	}

}
