package com.automation.selenium.tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This Example show how to interact with Grid*/
class Example4 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test
	public void datePicker() {
		try {
			driver.get("http://www.apsrtconline.in/oprs-web/");
			driver.findElement(By.xpath("//*[@value='Depart On']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='19'])[1]")).click();
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
