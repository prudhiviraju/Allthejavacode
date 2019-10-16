package com.automation.selenium.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

class Example7 {
	
	private WebDriver driver = null;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void waitUntilTextFieldEnabled(){
		try {
			driver.get(ApplicationConstants.SYNC_PATH +"WaitUntilTextFieldEnabled.html");
			driver.findElement(By.id("firstName")).sendKeys("SCOTT");
			driver.findElement(By.id("lastName")).sendKeys("TIGER");
			Thread.sleep(2000);	
		}catch(Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		}
		
	}
	
	@AfterTest
	public void afterTest(){
		driver.quit();
	}

}
