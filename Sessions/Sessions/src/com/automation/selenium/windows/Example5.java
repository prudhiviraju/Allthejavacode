package com.automation.selenium.windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.selenium.utils.DriverHelper;

/* This Example show how to use switchToWindow method*/
class Example5{

	@Test
	public void test() {
		
		WebDriver driver = null;
		
		String expectedTitle = "Honda Service - Procare Customer Service and Maintenance Tips";
		
		try {
		
			driver = DriverHelper.getChromeDriver();
			
			driver.get("https://www.hondacarindia.com/");
			
			WebElement lnkService = driver.findElement(By.xpath("//*[@class='menuIcon serviceIcon']"));
			
			lnkService.click();

			Set<String> windowHandles = driver.getWindowHandles();

			System.out.println("Number of Windows/Browsers:"+ windowHandles.size());
			
			Iterator<String> iterator = windowHandles.iterator();
			
			while (iterator.hasNext()) {
				driver.switchTo().window(iterator.next());
				String actualTitle = driver.getTitle();
				if(actualTitle.equals(expectedTitle)) {
					break;
				}
			}

			WebElement bookServices = driver.findElement(By.xpath("//span[text()='book a service']"));
			
			bookServices.click();
			
			WebElement txtName = driver.findElement(By.id("txt_Name"));
			
			txtName.sendKeys("SCOTT");
			
			Thread.sleep(2000);
			
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
