package com.automation.selenium.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to select item from drop down using selectByValue*/
class Example4 {

	@Test
	public void createPAN(){

		WebDriver driver = null;
		Select select = null;
		
		try {

			driver = DriverHelper.getChromeDriver();
			
			driver.get("http://www.applypanonline.com");

			driver.findElement(By.linkText("Apply for New PAN Card")).click();

			WebElement addressProof = driver.findElement(By.id("proofofresidence"));

			select = new Select(addressProof);

			select.selectByValue("10");
			
			Thread.sleep(3000);
			
			select.selectByValue("22");

			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}finally{
			driver.quit();	
		}
	}
}
