
package com.automation.selenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This example show how to use Actions class click and doubleClick methods*/
class Example2 {

	@Test
	public void clickAndDoubleClick() {

		WebDriver driver = null;

		try {
			driver = DriverHelper.getDriver("CHROME");

			driver.get("http://www.mkyong.com/wp-content/uploads/jQuery/jQuery-click-dblclick-example.html");

			WebElement singleClick = driver.findElement(By.id("singleClick"));

			Actions actions = new Actions(driver);

			actions.click(singleClick);

			actions.perform();

			Thread.sleep(2000);

			WebElement doubleClick = driver.findElement(By.id("doubleClick"));

			actions.doubleClick(doubleClick).perform();

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
