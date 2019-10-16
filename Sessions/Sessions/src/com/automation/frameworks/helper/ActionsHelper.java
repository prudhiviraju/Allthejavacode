package com.automation.frameworks.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ActionsHelper {

	/* Login into application */
	public static void login(String userName, String password) {

		try {

			DriverHelper.getWebDriver().findElement(By.name("userName")).sendKeys("mercury");

			DriverHelper.getWebDriver().findElement(By.name("password")).sendKeys("mercury");

			DriverHelper.getWebDriver().findElement(By.name("login")).click();

			WebElement signOff = DriverHelper.getWebDriver().findElement(By.xpath("//*[text()='SIGN-OFF']"));

			Assert.assertNotNull(signOff, "Verification for Login");

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}

	}

	/* find flight */
	public static void findFlight() {

		try {
			DriverHelper.getWebDriver().findElement(By.xpath("//*[@value='oneway']")).click();

			DriverHelper.getWebDriver().findElement(By.name("passCount")).sendKeys("1");

			DriverHelper.getWebDriver().findElement(By.xpath("//*[@value='Business']")).click();

			DriverHelper.getWebDriver().findElement(By.name("findFlights")).click();

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

	/* select flight */
	public static void selectFlight(){
		
		try{
			DriverHelper.getWebDriver().findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$363')]")).click();

			DriverHelper.getWebDriver().findElement(By.xpath("//*[@type ='radio' and contains(@value,'Unified Airlines$633')]")).click();

			DriverHelper.getWebDriver().findElement(By.name("reserveFlights")).click();
	
		}catch(Exception exception){
			System.out.println("Exception:" + exception.toString());
		}
		
	}
	
	/* book flight */
	public static void bookTicket(String firstName,String lastName){
		try{
			DriverHelper.getWebDriver().findElement(By.name("passFirst0")).sendKeys(firstName);

			DriverHelper.getWebDriver().findElement(By.name("passLast0")).sendKeys(lastName);

			DriverHelper.getWebDriver().findElement(By.name("pass.0.meal")).sendKeys("Vegetarian");

			DriverHelper.getWebDriver().findElement(By.name("buyFlights")).click();

			WebElement result = DriverHelper.getWebDriver().findElement(By.xpath("//*[contains(text(),'itinerary has been booked!')]"));

			Assert.assertNotNull(result,"Verification for book a ticket");

		}catch(Exception exception){
			System.out.println("Exception:" + exception.toString());
		}
	}
	
	public static void signOff(){
		try{
			/* Sing off */
			DriverHelper.getWebDriver().findElement(By.xpath("//*[text()='SIGN-OFF']")).click();
		}catch(Exception exception){
			System.out.println("Exception:" + exception.toString());
		}
	}

}
