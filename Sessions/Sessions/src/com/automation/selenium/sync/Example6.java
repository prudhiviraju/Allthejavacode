package com.automation.selenium.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to use elementToBeClickable()*/
class Example6 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test
	public void waitUntilButtonToBeClickable() {
		try {
			driver.get(ApplicationConstants.SYNC_PATH + "WaitUntilButtonEnabled.html");
			WebElement button = driver.findElement(By.xpath("//*[@value='Search']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(button));
			button.click();
			String actualMessage = driver.findElement(By.id("displayMessage")).getText();
			if ((actualMessage.equals(null)) | (actualMessage.equals(""))) {
				System.out.println("FAIL");
			} else {
				System.out.println("PASS");
			}
			Thread.sleep(1000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		}

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
