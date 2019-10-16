package com.automation.seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to execute script in local system */
class Example0 {

	@Test
	public void testMethod() {

		WebDriver driver = null;
		try {

			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			
			driver = new ChromeDriver();

			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN")).click();

			Thread.sleep(2000);

			driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");

			driver.findElement(By.id("lastnameupp")).sendKeys("TIGER");

			driver.findElement(By.xpath("//input[@id = 'middlenameupp']")).sendKeys("J");

			Thread.sleep(2000);
			
		} catch (Exception exception) {
			System.out.println(exception.toString());
		}finally{
			driver.quit();
		}

	}

}
