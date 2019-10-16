package com.automation.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Mobile_Web1 {
	
	AppiumDriver<MobileElement> driver = null;
	
	@BeforeTest
	public void onInitialize() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "a1a1e4a3");
			capabilities.setCapability("browserName", "chrome");
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("http://www.applypanonline.com");
		} catch (Exception exception) {
			System.out.println("Exception" + exception.toString());
		}

	}
	
	
	@Test
	public void createPan() {
		
		MobileElement linkNewPan =  driver.findElement(By.linkText("Apply for New PAN"));
		linkNewPan.click();
		
		MobileElement txtFirstName = driver.findElement(By.id("firstnameupp"));
		txtFirstName.sendKeys("SCOTT");
		
		MobileElement txtLastName = driver.findElement(By.id("lastnameupp"));
		txtLastName.sendKeys("SCOTT");
		
		MobileElement idProof = driver.findElement(By.id("proofofidentity"));
		idProof.sendKeys("Passport");
		
		
	}
	
	
	@AfterTest
	public void onTerminate(){
		driver.close();
	}

}
