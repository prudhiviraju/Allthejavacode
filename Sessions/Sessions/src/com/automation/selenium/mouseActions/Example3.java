package com.automation.selenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This example show how to use dragAndDrop method*/
class Example3 {

	@Test
	public void dragAndDrop() {

		WebDriver driver = null;

		try {
			driver = DriverHelper.getDriver("CHROME");

			driver.get("http://jqueryui.com/droppable/");

			driver.switchTo().frame(0);

			WebElement source = driver.findElement(By.id("draggable"));

			WebElement target = driver.findElement(By.id("droppable"));

			Actions actions = new Actions(driver);

			actions.dragAndDrop(source, target);

			actions.perform();

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}
}
