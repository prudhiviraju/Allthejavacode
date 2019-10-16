package com.automation.coreJava.interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows use of interface(WebDriver)*/
class Example2 {
	
	public void test(String browserName){
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
			driver = new InternetExplorerDriver();
		}
		driver.get("http://www.applypanonline.com/");
		driver.quit();
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.test("CHROME");
	}

}
