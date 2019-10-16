package com.automation.coreJava.inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* This example shows how to implement inheritance concept*/
class TestScript01 extends FrameworkScript {

	private WebDriver driver = null;

	public void createAccount() {
		driver = launchBrowser("CHROME");
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		driver.close();
	}

	public static void main(String[] args) {
		TestScript01 script01 = new TestScript01();
		script01.createAccount();
	}

}
