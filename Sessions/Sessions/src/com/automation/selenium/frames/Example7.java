package com.automation.selenium.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToFrame() and switchToDefaultContent() method*/
class Example7 {

	@Test
	public void test() {

		WebDriver driver = null;
		try {

			driver = DriverHelper.getDriver("CHROME");

			driver.get("http://seleniumhq.github.io/selenium/docs/api/java/");

			driver.switchTo().frame("packageListFrame");

			WebElement packageLink = driver.findElement(By.linkText("com.thoughtworks.selenium"));

			DriverHelper.highlightObject(driver, packageLink);

			packageLink.click();

			Thread.sleep(2000);

			driver.switchTo().defaultContent();

			driver.switchTo().frame("packageFrame");

			WebElement seleniumException = driver.findElement(By.linkText("SeleniumException"));

			DriverHelper.highlightObject(driver, seleniumException);

			seleniumException.click();

			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
