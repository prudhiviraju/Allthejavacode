package com.automation.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use maximize,back ,forward ,refresh and quit methods */
class Example3 {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			Options options = driver.manage();

			Window window = options.window();

			window.maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			Navigation navigation = driver.navigate();
			
			navigation.to("https://twitter.com/");
			
			Thread.sleep(2000);

			navigation.back();
			
			Thread.sleep(2000);
			
			navigation.forward();
			
			Thread.sleep(2000);
			
			navigation.refresh();
			
			Thread.sleep(2000);

		}catch(Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}finally {
			driver.quit();	
		}

	}
}
