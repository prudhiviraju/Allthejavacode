package com.automation.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use findElements()method */
class Example7 {

	public static void main(String[] args) {

		WebDriver driver  = null;
		
		try {
			List<WebElement> webElements = null;

			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("http://www.applypanonline.com/new-pan-card-applicationform.php");

			webElements = driver.findElements(By.tagName("a"));

			System.out.println("WebElements Count:" + webElements.size());

			for (WebElement webElement : webElements) {
				if(webElement.isDisplayed()) {
					DriverHelper.highlightObject(driver, webElement);	
				}
			}

			webElements = driver.findElements(By.tagName("select"));

			System.out.println("WebElements Count:" + webElements.size());

			for (WebElement webElement : webElements) {
				if(webElement.isDisplayed()) {
					DriverHelper.highlightObject(driver, webElement);	
				}
			}

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}finally {
			driver.quit();
		}

	}

}
