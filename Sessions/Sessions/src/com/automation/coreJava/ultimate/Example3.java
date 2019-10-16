package com.automation.coreJava.ultimate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* final keyword at class level ,uncomment 10th line and comment 11'th line in FrameworkScript then it will give an error messages at 7 and 12th lines in this class*/
class Example3 extends FrameworkScript {

	private WebDriver driver = null;
	
	public void createAccount() {
		driver = launchBrowser("CHROME");
		driver.get("https://www.applypanonline.com/");
		driver.findElement(By.linkText("Apply for New PAN")).click();
		driver.findElement(By.id("firstnameupp")).sendKeys("SCOTT");
		driver.close();
	}

	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.createAccount();
	}


}
