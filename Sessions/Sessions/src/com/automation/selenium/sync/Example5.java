package com.automation.selenium.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

class Example5 {

	private WebDriver driver = null;

	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test
	public void waitUntilButtonToBeClickable(){
		try {
			driver.get(ApplicationConstants.SYNC_PATH + "WaitUntilButtonEnabled.html");
			WebElement button = driver.findElement(By.xpath("//*[@value='Search']"));
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
	public void destroy() {
		driver.quit();
	}

}
