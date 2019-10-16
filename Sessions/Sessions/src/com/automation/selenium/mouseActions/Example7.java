package com.automation.selenium.mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use contextClick(RightClick) method*/
class Example7 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void rightClick() {
		try {
			driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
			WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
			Actions actions = new Actions(driver);
			actions.contextClick(rightClick).perform();
			Thread.sleep(2000);
			WebElement editOPtion = driver.findElement(By.xpath("//span[text()='Edit']"));
			actions.click(editOPtion).perform();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
