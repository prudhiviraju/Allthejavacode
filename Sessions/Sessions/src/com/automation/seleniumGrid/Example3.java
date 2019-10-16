package com.automation.seleniumGrid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/* This example shows how to execute script in Remote System */
class Example3 {

	@Test
	public void createAccount() {

		WebDriver driver = null;
		
		try {

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN")).click();

			Thread.sleep(5000);

			driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");

			driver.findElement(By.id("lastnameupp")).sendKeys("TIGER");

			driver.findElement(By.xpath("//input[@id = 'middlenameupp']")).sendKeys("J");

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println(exception.toString());
		} finally {
			driver.quit();
		}

	}

}
