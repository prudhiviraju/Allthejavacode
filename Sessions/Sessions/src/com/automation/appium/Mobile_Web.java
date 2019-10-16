package com.automation.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/* This example shows how to execute script in mobile browser*/

class Mobile_Web {

	AppiumDriver<WebElement> driver = null;

	@BeforeTest
	public void setUp() {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "a1a1e4a3");
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("platformName", "android");

		try {
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		}

	}

	@Test
	public void test() {
		try {
			driver.get("https://www.bankbazaar.com");
			driver.findElementByLinkText("Home Loan").click();
			driver.findElementByPartialLinkText("PNBHFL").click();
			Thread.sleep(5000);
			
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		}

	}

	@AfterTest
	public void tearDown() {
		try {
			driver.close();
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		}

	}

}
