package com.automation.selenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This example show how to use Actions click method*/
class Example1 {

	@Test
	public void clickMethod() {

		WebDriver driver = null;
		try {

			driver = DriverHelper.getDriver("CHROME");

			driver.get("http://electoralsearch.in/");

			WebElement btnContinue = driver.findElement(By.id("continue"));

			Actions actions = new Actions(driver);
			
			actions.click(btnContinue);
			
			actions.perform();

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}
	}

}
