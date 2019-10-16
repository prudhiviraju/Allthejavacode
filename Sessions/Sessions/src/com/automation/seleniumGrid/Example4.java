package com.automation.seleniumGrid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class Example4 {

	WebDriver driver = null;

	@BeforeTest
	public void setUp(ITestContext context) {
		DesiredCapabilities capabilities = null;
		String browser = context.getCurrentXmlTest().getParameter("browser");
		try {
			switch (browser.toUpperCase()) {
			case "CHROME":
				capabilities = DesiredCapabilities.chrome();
				break;
			case "FF":
				capabilities = DesiredCapabilities.firefox();
				break;
			case "IE":
				capabilities = DesiredCapabilities.internetExplorer();
				break;
			}
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}

	}

	@Test
	public void createAccount() {

		try {
			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN")).click();

			Thread.sleep(5000);

			driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");

			driver.findElement(By.id("lastnameupp")).sendKeys("TIGER");

			driver.findElement(By.xpath("//input[@id = 'middlenameupp']")).sendKeys("J");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		}

	}
	
	@AfterTest
	public void tearDown() {
		try {
			driver.quit();
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		}
	}

}
