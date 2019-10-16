package com.automation.selenium.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* Example to show how to retrieve value from application  and validate with expected value */
class Example4 {

	@Test
	public void test() {
		
		WebDriver driver = null;
		
		String expectedText = "From";
		
		try {
		
			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.apsrtconline.in/oprs-web/");
			
			String actualText = driver.findElement(By.name("source")).getAttribute("value");
			
			if (actualText.equals(expectedText)) {
				System.out.println("PASS:" + actualText + ":" + expectedText);
			} else {
				System.out.println("FAIL:" + actualText + ":" + expectedText);
			}
			
			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}
	}

}
