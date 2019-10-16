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

/* This example show how to use @Parameters */

class Example9 {

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
	@Parameters({"UserName","Password"})
	@Test(priority = 0)
	public void login(String userName,String password) {
		driver.findElement(By.name("userName")).sendKeys(userName);

		driver.findElement(By.name("password")).sendKeys(password);

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
	@Parameters({"FirstName","LastName"})
	@Test(priority = 3, dependsOnMethods = "selectFlight")
	public void bookTicket(String firstName,String lastName) {
		
		driver.findElement(By.name("passFirst0")).sendKeys(firstName);

		driver.findElement(By.name("passLast0")).sendKeys(lastName);

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
