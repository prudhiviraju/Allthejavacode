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

/* This example show how to use WebElement sendKeys and Actions sendKeys(By using Keys.ENTER(Keyboard Event)) method*/
class Example1 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void keyboardEventEnter(){
		try {
		driver.get("http://electoralsearch.in/");
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement btnSearch = driver.findElement(By.id("btnDetailsSubmit"));
		Actions actions = new Actions(driver);
		actions.sendKeys(btnSearch,Keys.ENTER);
		actions.perform();
		Thread.sleep(3000);
		}catch(Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
