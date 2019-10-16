package com.automation.coreJava.interfaces;

import org.openqa.selenium.chrome.ChromeDriver;


/* This example shows use of interface(WebDriver)*/
/* if you uncomment below lines then it will give error messages */

class Example1 {
	
	public void test(String browserName){
		ChromeDriver driver = null;
		if(browserName.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			//FirefoxDriver driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			//InternetExplorerDriver driver = new InternetExplorerDriver();
		}
		driver.get("http://www.applypanonline.com/");
		driver.quit();
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.test("CHROME");
	}

}
