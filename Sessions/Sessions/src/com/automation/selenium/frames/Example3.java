package com.automation.selenium.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to find number of frames and highlight every frame*/

class Example3 {

	@Test
	public void test() {
		
		WebDriver driver = null;
		
		try {

			driver = DriverHelper.getDriver("CHROME");
		
			driver.get("http://www.ramcocements.in/");

			List<WebElement> frames = driver.findElements(By.tagName("iframe"));

			System.out.println("Frames Count:" + frames.size());

			for (WebElement frame : frames) {
				DriverHelper.highlightObject(driver, frame);
				System.out.println("Frame Name:" + frame.getAttribute("name"));
			}

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
