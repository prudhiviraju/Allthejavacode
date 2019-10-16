package com.automation.coreJava.decisionMaking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* Example to show how to use if conditional statement */
class Example3 {

	public static void main(String[] args) throws Exception{

		String browserName = "CHROME";
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("CHROME")) {
			
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			
			driver = new ChromeDriver();
			
			driver.get("http://www.applypanonline.com");
			
			Thread.sleep(2000);
			
			driver.quit();
		}
		
	}

}
