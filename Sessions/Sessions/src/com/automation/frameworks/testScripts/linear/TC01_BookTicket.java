package com.automation.frameworks.testScripts.linear;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to implement automation scripts by using Linear Approach */
class TC01_BookTicket {

	@Test
	public void bookTicket() {

		WebDriver driver = null;

		try {

			/* Create Driver object */
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.get("http://newtours.demoaut.com/");

			/* Login into application */
			driver.findElement(By.name("userName")).sendKeys("mercury");

			driver.findElement(By.name("password")).sendKeys("mercury");

			driver.findElement(By.name("login")).click();
			
			WebElement signOff = driver.findElement(By.xpath("//*[text()='SIGN-OFF']"));
			
			Assert.assertNotNull(signOff,"Verification for Login");
			
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

			Assert.assertNotNull(result,"Verification for book a ticket");

			/* Sing off */
			driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		} finally {
			driver.quit();
		}
	}

}
