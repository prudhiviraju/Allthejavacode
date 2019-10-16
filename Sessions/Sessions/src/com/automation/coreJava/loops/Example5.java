package com.automation.coreJava.loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* Example to show how to use while statement */
class Example5 {

	public static void main(String[] args) throws InterruptedException{
		
		String browser = "CHROME";
		WebDriver driver = null;
		
		while(browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
			driver.get("https://twitter.com/");
			Thread.sleep(2000);
			driver.quit();
			browser="FF";
		}
	}

}
