package com.automation.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show hows to use @Test groups attribute */
class Example10 {

	private WebDriver driver = null;

	@BeforeTest(groups={"Regression","Smoke" })
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");
	}
	

	@Test(groups = "Regression")
	public void regressionFunctionality() {
		System.out.println("RegressionFunctionality");
	}

	@Test(groups = "Smoke")
	public void smokeFunctionality() {
		System.out.println("SmokeFunctionality");
	}

	@AfterTest(groups = {"Regression","Smoke" })
	public void afterGroup() {
		driver.quit();
	}
}
