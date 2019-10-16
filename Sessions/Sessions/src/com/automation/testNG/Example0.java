package com.automation.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to execute script without using TestNG(@Test) */
class Example0 {

	public void bookTicket() {

		WebDriver driver = null;

		try {

			/* Create Chrome Driver object*/
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

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
			
			if(result.equals(null)) {
				System.out.println("Fail");
			}else {
				System.out.println("Pass");
			}
			
			/* Sing off */
			driver.findElement(By.xpath("//*[text()='SIGN-OFF']")).click();
			
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}
	}

	public static void main(String[] args) {
		Example0 example0 = new Example0();
		example0.bookTicket();
	}

}
