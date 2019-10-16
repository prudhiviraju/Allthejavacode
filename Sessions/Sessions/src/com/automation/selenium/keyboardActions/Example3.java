package com.automation.selenium.keyboardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use Actions class(keyDown and keyUp) methods*/
class Example3 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void keyDownAndKeyUp() {
		try {
			driver.get("https://www.facebook.com/");
			Actions actions = new Actions(driver);

			WebElement firstName = driver.findElement(By.name("firstname"));
			actions.click(firstName);
			actions.keyDown(Keys.SHIFT);
			actions.sendKeys("scott");
			actions.keyUp(Keys.SHIFT);
			actions.perform();
			Thread.sleep(2000);

			WebElement lastName = driver.findElement(By.name("lastname"));
			actions.click(lastName);
			actions.keyDown(Keys.SHIFT);
			actions.sendKeys("tiger");
			actions.keyUp(Keys.SHIFT);
			actions.perform();
			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
