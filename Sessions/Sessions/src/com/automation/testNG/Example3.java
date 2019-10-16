package com.automation.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use Assert methods*/

class Example3 {

	private WebDriver driver = null;

	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser) {
		
		switch (browser) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
			break;
		case "FF":
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
			break;	
		case "IE":
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
			driver = new InternetExplorerDriver();
			break;	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void bookTicket() {
		
		driver.get("http://newtours.demoaut.com/");
		
		/* Login into application */
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

		driver.findElement(By.name("login")).click();

		/* find flight */
		driver.findElement(By.xpath("//*[@value='oneway']")).click();

		driver.findElement(By.name("passCount")).sendKeys("1");

		driver.findElement(By.xpath("//*[@value='Business']")).click();

		driver.findElement(By.name("findFlights")).click();

		/* select flight */
		driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$363')]")).click();

		driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$633')]")).click();

		driver.findElement(By.name("reserveFlights")).click();

		/* book flight */
		driver.findElement(By.name("passFirst0")).sendKeys("SCOTT");

		driver.findElement(By.name("passLast0")).sendKeys("TIGER");

		driver.findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");

		driver.findElement(By.name("buyFlights")).click();

		WebElement result = driver.findElement(By.xpath("//*[contains(text(),'itinerary has been booked!')]"));

		Assert.assertNotNull(result);

		/* Sing off */
		driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
