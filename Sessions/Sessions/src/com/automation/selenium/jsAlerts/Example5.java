package com.automation.selenium.jsAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToAlert method*/
class Example5 {

	public static void main(String[] args) {

		WebDriver driver = null;

		try {

			driver = DriverHelper.getChromeDriver();

			driver.get("http://www.apsrtconline.in/oprs-web/");

			driver.findElement(By.id("searchBtn")).click();

			Thread.sleep(3000);

			Alert alert = driver.switchTo().alert();

			System.out.println(alert.getText());

			alert.accept();

			Thread.sleep(2000);

		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
