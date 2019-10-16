package com.automation.emulator;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to execute script in mobile emulator */
class TC01_HomeInsurance_Structure {

	private WebDriver driver = null;

	@SuppressWarnings("deprecation")
	@BeforeTest
	private void setUp() {
		Map<String, String> mobileEmulation = null;
		Map<String, Object> chromeOptions = null;
		try {
			String DeviceName = "Apple iPhone 5";
			DesiredCapabilities capabilities = null;
			
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", DeviceName);

			chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);

			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			driver = new ChromeDriver(capabilities);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}

	}
	
	@Test
	public void createHomeInsurance() {

		try {
			driver.get("https://www.policybazaar.com/");

			driver.findElement(By.xpath("//*[text()='Home']")).click();

			driver.findElement(By.xpath("//*[text()=' Rented ']")).click();

			driver.findElement(By.id("ddlPropertyAge")).sendKeys("Upto 30 years");

			driver.findElement(By.xpath("//*[text()=' Flat / Apartment ']")).click();

			driver.findElement(By.xpath("//*[@for='rdStruct']")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("next_1")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("ddlStructureCover")).sendKeys("50,00,000");

			Thread.sleep(2000);

			driver.findElement(By.id("next_2")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("txtName")).sendKeys("SCOTT");

			driver.findElement(By.xpath("//*[@for='rdMale']")).click();
			
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@for='rdMarried']")).click();

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpDay")).sendKeys("11");

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpMonth")).sendKeys("Aug");

			driver.findElement(By.id("MainContent_BookingEngineNew_ucDateOfBirth_drpYear")).sendKeys("1985");

			driver.findElement(By.id("ddlAnnualIncome")).sendKeys("10-15 Lakhs");

			driver.findElement(By.id("txtEmail")).sendKeys("scott@scott.com");

			driver.findElement(By.id("txtMobile")).sendKeys("9112345678");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}
	}
	
	@AfterTest
	private void tearDown() {
		try {
			driver.close();
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

}
