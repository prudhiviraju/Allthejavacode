package com.automation.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use @Test priority attribute*/

class Example5 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test(priority = 0)
	public void login() {
		
		driver.get("http://newtours.demoaut.com/");
		
		/* Login into application */
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

		driver.findElement(By.name("login")).click();
		
		WebElement signOff = driver.findElement(By.xpath("//*[text()='SIGN-OFF']"));
		
		Assert.assertNotNull(signOff);

	}

	@Test(priority = 1)
	public void findFlight() {
		/* find flight */
		driver.findElement(By.xpath("//*[@value='oneway']")).click();

		driver.findElement(By.name("passCount")).sendKeys("1");

		driver.findElement(By.xpath("//*[@value='Business']")).click();

		driver.findElement(By.name("findFlights")).click();

	}

	@Test(priority = 2)
	public void selectFlight() {
		/* select flight */
		driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$363')]")).click();

		driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$633')]")).click();

		driver.findElement(By.name("reserveFlights")).click();

	}

	@Test(priority = 3)
	public void bookTicket() {
		/* book flight */
		driver.findElement(By.name("passFirst0")).sendKeys("SCOTT");

		driver.findElement(By.name("passLast0")).sendKeys("TIGER");

		driver.findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");

		driver.findElement(By.name("buyFlights")).click();

		WebElement result = driver.findElement(By.xpath("//*[contains(text(),'itinerary has been booked!')]"));

		Assert.assertNotNull(result);
	}

	@Test(priority = 4)
	public void logOff() {
		/* Sing off */
		driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
