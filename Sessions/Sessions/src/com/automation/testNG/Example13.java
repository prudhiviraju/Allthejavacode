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

/* This example shows how to execute TestScripts parallel */

class Example13 {

	private WebDriver driver = null;

	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser) {
		switch (browser.toUpperCase()) {
			case "CHROME":
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
		driver.get("http://newtours.demoaut.com/");
	}

	/* Login into application */
	@Test(priority = 0)
	public void login() {
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

		driver.findElement(By.name("login")).click();
		
		WebElement signOff = driver.findElement(By.xpath("//*[text()='SIGN-OFF']"));
		
		Assert.assertNotNull(signOff);

	}

	/* find flight */
	@Test(priority = 1,dependsOnMethods="login")
	public void findFlight() {
		
		driver.findElement(By.xpath("//*[@value='oneway']")).click();

		driver.findElement(By.name("passCount")).sendKeys("1");

		driver.findElement(By.xpath("//*[@value='Business']")).click();

		driver.findElement(By.name("findFlights")).click();

	}

	/* select flight */
	@Test(priority = 2, dependsOnMethods = "findFlight")
	public void selectFlight() {

		driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$363')]")).click();

		driver.findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$633')]")).click();

		driver.findElement(By.name("reserveFlights")).click();

	}

	/* book flight */
	@Test(priority = 3, dependsOnMethods = "selectFlight")
	public void bookTicket() {
		
		driver.findElement(By.name("passFirst0")).sendKeys("scott");

		driver.findElement(By.name("passLast0")).sendKeys("tiger");

		driver.findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");

		driver.findElement(By.name("buyFlights")).click();

		WebElement result = driver.findElement(By.xpath("//*[contains(text(),'itinerary has been booked!')]"));

		Assert.assertNotNull(result);
	}

	/* Sing off */
	@Test(priority = 4,dependsOnMethods = "login")
	public void logOff() {
		driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
