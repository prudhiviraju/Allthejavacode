package com.automation.coreJava.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* This example shows how to handle checked exception by using throws keyword*/
class Example5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);

		driver = new ChromeDriver();

		driver.get("http://www.applypanonline.com");

		driver.findElement(By.linkText("Apply for New PAN")).click();

		Thread.sleep(5000);

		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");

		driver.quit();

	}

}
