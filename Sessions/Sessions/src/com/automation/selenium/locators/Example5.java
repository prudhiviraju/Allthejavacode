package com.automation.selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.selenium.utils.ApplicationConstants;
import com.automation.selenium.utils.DriverHelper;

/* Example to show how to use findElementByXPath()method  by using following-sibling and preceding-sibling*/
class Example5 {

	public static void main(String[] args) {

		WebDriver driver = null;
		
		try {
			
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();

			driver.get("https://www.applypanonline.com/new-pan-card-applicationform.php");

			WebElement txtFirstName = driver.findElement(By.xpath("//*[@id='lastnameupp']/preceding::input[@type='text']"));

			DriverHelper.highlightObject(driver, txtFirstName);

			WebElement listMonth = driver.findElement(By.xpath("//*[@id='dd']/following-sibling::select"));

			DriverHelper.highlightObject(driver, listMonth);

			WebElement textYear = driver.findElement(By.xpath("//*[@id='dd']/following-sibling::input"));

			DriverHelper.highlightObject(driver, textYear);

			WebElement listDate = driver.findElement(By.xpath("//*[@id='mm']/preceding-sibling::select"));

			DriverHelper.highlightObject(driver, listDate);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		} finally {
			driver.quit();
		}

	}
}
