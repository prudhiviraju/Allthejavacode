package com.automation.frameworks.testScripts.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.frameworks.screens.BookFlightPage;
import com.automation.frameworks.screens.FlightFinderPage;
import com.automation.frameworks.screens.LoginPage;
import com.automation.frameworks.screens.SelectFlightPage;
import com.automation.frameworks.screens.SignOffPage;
import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to implement automation scripts by using (Page Object Model)POM */
class TC01_BookTicket {

	@Test
	public void bookTicket() {

		WebDriver driver = null;

		try {

			/* Create Driver object */
			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			PageFactory.initElements(driver, LoginPage.class);
			
			PageFactory.initElements(driver, FlightFinderPage.class);
			
			PageFactory.initElements(driver, SelectFlightPage.class);
			
			PageFactory.initElements(driver, BookFlightPage.class);
			
			PageFactory.initElements(driver, SignOffPage.class);

			driver.manage().window().maximize();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.get("http://newtours.demoaut.com/");

			/* Login into application */
			LoginPage.txt_UserName.sendKeys("mercury");

			LoginPage.txt_Password.sendKeys("mercury");

			LoginPage.btn_SignOn.click();
			
			Assert.assertNotNull(FlightFinderPage.lnk_SignOff,"Verification for Login");
			
			/* find flight */
			FlightFinderPage.rb_OneWay.click();

			FlightFinderPage.lst_Passengers.sendKeys("1");

			FlightFinderPage.rb_Business.click();
			
			FlightFinderPage.btn_Continue.click();

			/* select flight */
			SelectFlightPage.rb_From.click();

			SelectFlightPage.rb_To.click();

			SelectFlightPage.btn_Continue.click();

			/* book flight */
			BookFlightPage.txtUserName.sendKeys("SCOTT");

			BookFlightPage.txtLastName.sendKeys("TIGER");

			BookFlightPage.lstMealType.sendKeys("Vegetarian");

			BookFlightPage.btn_SecurePurchase.click();

			Assert.assertNotNull(SignOffPage.txtMessage,"Verification for book a ticket");

			/* Sing off */
			SignOffPage.btnSignOff.click();

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		} finally {
			driver.quit();
		}
	}

}
