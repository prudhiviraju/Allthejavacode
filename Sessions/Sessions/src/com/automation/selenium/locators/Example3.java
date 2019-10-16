package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use findElementByXPath()method */
class Example3 {

	public static void main(String[] args) {

		WebDriver driver  = null;
		
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://www.apsrtconline.in/oprs-web/guest/home.do?h=1");

			WebElement btnAvailability = driver.findElement(By.xpath("//*[@type='button']"));

			DriverHelper.highlightObject(driver, btnAvailability);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}
}
