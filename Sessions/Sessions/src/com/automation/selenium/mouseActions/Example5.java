package com.automation.selenium.mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example show how to use moveToElement method*/
class Example5 {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@Test
	public void moveToElement() {
		try {
			driver.get("http://www.techmahindra.com/pages/default.aspx");

			WebElement linkWeAre = driver.findElement(By.xpath("//*[text()='Who We Are']"));

			Actions actions = new Actions(driver);

			actions.moveToElement(linkWeAre).perform();

			Thread.sleep(2000);

			WebElement linkTechMahindra = driver.findElement(By.linkText("Tech Mahindra"));

			actions.moveToElement(linkTechMahindra).perform();

			Thread.sleep(2000);

			WebElement linkInnovation = driver.findElement(By.xpath("(//*[text()='Innovation'])[1]"));

			linkInnovation.click();

			Thread.sleep(2000);
		} catch (Exception exception) {
			System.out.println("Exception:" + exception.getMessage());
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
