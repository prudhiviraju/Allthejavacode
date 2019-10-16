package com.automation.coreJava.decisionMaking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* Example to show how to use if else if conditional statement */
class Example4 {

	public static void main(String[] args) throws Exception{

		String browserName = "IE";
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
			driver = new InternetExplorerDriver();
		}
		driver.get("http://www.applypanonline.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
