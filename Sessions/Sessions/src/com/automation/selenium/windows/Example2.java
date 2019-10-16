package com.automation.selenium.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToWindow method*/
class Example2 {

	@Test
	public void test() {
		
		WebDriver driver = null;
		
		try {
			
			driver = DriverHelper.getChromeDriver();

			driver.get("https://www.hondacarindia.com/");

			WebElement lnkService = driver.findElement(By.xpath("//*[@class='menuIcon serviceIcon']"));

			lnkService.click();
			
			Thread.sleep(5000);

			Set<String> windowHandles = driver.getWindowHandles();

			System.out.println("Number of Windows/Browsers:" + windowHandles.size());

			Iterator<String> iterator = windowHandles.iterator();

			while (iterator.hasNext()) {
				driver.switchTo().window(iterator.next());
				System.out.println("Title:" + driver.getTitle());
				driver.close();
			}

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
