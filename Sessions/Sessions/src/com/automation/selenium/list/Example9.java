package com.automation.selenium.list;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example shows how to get All selected Options from drop down */
class Example9 {

	@Test
	public void test() {

		WebDriver driver = null;
		Select select = null;
		List<String> actualList = new ArrayList<String>();
		List<String> expectedList = new ArrayList<String>();

		try {
			expectedList.add("Volvo");
			expectedList.add("Opel");
			expectedList.add("Audi");

			driver = DriverHelper.getChromeDriver();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

			driver.switchTo().frame("iframeResult");

			WebElement lstCars = driver.findElement(By.name("cars"));

			select = new Select(lstCars);

			System.out.println("Single Select(false) or MultiSelect(true) dropdown:" + select.isMultiple());

			select.selectByIndex(0);

			Thread.sleep(2000);

			select.selectByVisibleText("Opel");

			Thread.sleep(2000);

			select.selectByValue("audi");

			List<WebElement> selectedOptions = select.getAllSelectedOptions();

			for (WebElement webElement : selectedOptions) {
				System.out.println(webElement.getText());
				actualList.add(webElement.getText());
			}

			Assert.assertEquals(actualList, expectedList);
			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}
	}
}
