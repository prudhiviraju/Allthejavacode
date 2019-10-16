package com.automation.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("rawtypes")
/* This example shows how to execute APP Script in mobile */
class Mobile_App{

	private AndroidDriver driver;
	private String appiumURL ="http://0.0.0.0:4723/wd/hub";
	
	@BeforeClass
	public void startApp() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "a1a1e4a3");
			capabilities.setCapability("appPackage", "com.apsrtc.online");
			capabilities.setCapability("appActivity", "com.abhibus.app.apsrtc.DashBoardActivity");
			driver = new AndroidDriver(new URL(appiumURL), capabilities);
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

	@Test
	public void appActivity() throws Exception {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Ticket']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='Login']")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc='SignUp']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='loginName']")).sendKeys("scott98");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='fullName']")).sendKeys("scotttiger");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("scotttiger@tiger.com");
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='mobileNo']")).sendKeys("9112345678");
		Thread.sleep(10000);
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}

}
