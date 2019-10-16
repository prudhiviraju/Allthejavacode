package com.automation.selenium.keyboardActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use Robot class(keyPress) methods*/
class Example7 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void keyPress() {
		try {
			driver.get("http://newtours.demoaut.com/");
			Thread.sleep(2000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_F11);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_F11);
			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
