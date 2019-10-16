package com.automation.testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use Assert methods*/
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
	public void personalInformation() {
		int expectedItemCount = 32;
		boolean actualStatus = true;
		driver.get("https://www.applypanonline.com");
		driver.findElement(By.linkText("Apply for New PAN Card")).click();
		boolean expectedStatus = driver.findElement(By.id("category10")).isSelected();
		Assert.assertEquals(actualStatus, expectedStatus,"Default individual should be selected");
		WebElement listDD = driver.findElement(By.id("dd"));
		Select select = new Select(listDD);
		List<WebElement> listOptions = select.getOptions();
		int actualItemCount = listOptions.size();
		Assert.assertEquals(actualItemCount, expectedItemCount,"List should be displayed 32 items");
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
