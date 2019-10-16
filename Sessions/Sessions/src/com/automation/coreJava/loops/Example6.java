package com.automation.coreJava.loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* Example to show how to use do while statement */
class Example6 {

	public static void main(String[] args) throws InterruptedException{
		
		String browser = "FF";
		do {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.quit();
		}while(browser.equals("CHROME"));
	}

}
