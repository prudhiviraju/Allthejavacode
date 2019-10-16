package com.automation.coreJava.decisionMaking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* Example to show how to use switch case conditional statement */
class Example5 {

	public static void main(String[] args) throws Exception{

		String browserName = "IE";
		WebDriver driver = null;
		
		switch (browserName.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
				driver = new ChromeDriver();
				break;
			case "FF":
				System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
				driver = new FirefoxDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
				driver = new InternetExplorerDriver();
				break;
		}
		driver.get("http://www.applypanonline.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
