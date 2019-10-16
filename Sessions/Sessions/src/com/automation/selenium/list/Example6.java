package com.automation.selenium.list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to find number of items in drop down to and retrieve items from drop down */
class Example6 {

	@Test
	public void createPAN() {

		WebDriver driver = null;
		Select select = null;
		List<WebElement> items = null;

		try {
			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN Card")).click();

			WebElement idProof = driver.findElement(By.id("proofofidentity"));

			select = new Select(idProof);

			items = select.getOptions();

			System.out.println("Number of Items in DropDown:" + items.size());

			for (WebElement item : items) {
				System.out.println(item.getText());
			}

			WebElement proofOfResidence = driver.findElement(By.id("proofofresidence"));

			select = new Select(proofOfResidence);

			items = select.getOptions();

			System.out.println("Number of Items in DropDown:" + items.size());

			for (WebElement item : items) {
				System.out.println(item.getText());
			}

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
