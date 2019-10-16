package com.automation.selenium.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This example show how to use moveToElement method*/
class Example4 {

	@Test
	public void moveToElement(){
		
		WebDriver driver = null;
		
		try {
			driver = DriverHelper.getDriver("CHROME");
		
			driver.get("http://www.techmahindra.com/pages/default.aspx");

			WebElement linkWeAre = driver.findElement(By.xpath("//*[text()='Who We Are']"));

			Actions actions = new Actions(driver);

			actions.moveToElement(linkWeAre).perform();

			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
