package com.automation.appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDemo {
	
	AppiumDriver<MobileElement> driver = null;
	
	@Test
	public void test() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "a1a1e4a3");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("browserName", "chrome");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.close();
		
	}

}
