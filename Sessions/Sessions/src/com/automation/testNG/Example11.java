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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use @DataProvider */

class Example11 {
	
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
		
	}

	@Test(priority=0,dataProvider="getTestData")
	public void bookTicket(String userName,String password,String firstName,String lastName) {

		try {
			
			driver.get("http://newtours.demoaut.com/");
			
			/* Login into application */
			driver.findElement(By.name("userName")).sendKeys(userName);

			driver.findElement(By.name("password")).sendKeys(password);
			
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
			driver.findElement(By.name("passFirst0")).sendKeys(firstName);
			
			driver.findElement(By.name("passLast0")).sendKeys(lastName);
			
			driver.findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");
			
			driver.findElement(By.name("buyFlights")).click();
			
			WebElement result = driver.findElement(By.xpath("//*[contains(text(),'itinerary has been booked!')]"));
			
			Assert.assertNotNull(result);
			
			/* Sing off */
			driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();
			
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@DataProvider(name = "getTestData")
	public Object[][] getTestData() {
		
		String[][] testData = new String[2][4];

		testData[0][0] = "mercury";
		testData[0][1] = "mercury";
		testData[0][2] = "scott";
		testData[0][3] = "tiger";
		
		testData[1][0] = "mercury";
		testData[1][1] = "mercury";
		testData[1][2] = "shriram";
		testData[1][3] = "srikrishna";
		
		return testData;
	}
	
}
