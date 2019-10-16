package com.automation.coreJava.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.coreJava.interfaces.ApplicationConstants;

/* This example shows abnormal termination of a program*/
class Example3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.applypanonline.com");

		driver.findElement(By.linkText("Apply for New PAN")).click();

		driver.findElement(By.id("firstnameuppp")).sendKeys("SCOTT");
	
		driver.quit();
	}

}
