package com.automation.selenium.keyboardActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use Robot class methods*/
class Example5 {

WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void keyPress() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	
}
