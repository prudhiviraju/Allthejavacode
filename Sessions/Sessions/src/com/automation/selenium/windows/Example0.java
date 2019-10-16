package com.automation.selenium.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToWindow method*/
class Example0 {

	@Test
	public void test() {

		WebDriver driver = null;

		try {

			driver = DriverHelper.getChromeDriver();

			driver.get("https://www.hondacarindia.com/");

			System.out.println("WindowHandle:" + driver.getWindowHandle());

			Set<String> windowHandles = driver.getWindowHandles();

			System.out.println("Number of Windows/Browsers:" + windowHandles.size());

			Iterator<String> windows = windowHandles.iterator();

			while (windows.hasNext()) {
				System.out.println("WindowHandle:" + driver.switchTo().window(windows.next()).getWindowHandle());
			}

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
