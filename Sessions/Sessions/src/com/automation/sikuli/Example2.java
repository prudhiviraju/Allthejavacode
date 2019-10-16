package com.automation.sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use sikulli methods */
class Example2 {

	@Test
	public void upload() {
		WebDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("input_resumeParser")).click();
			Screen screen = new Screen();
			screen.setAutoWaitTimeout(60);
			screen.type(ApplicationConstants.SCREENS_PATH + "edit_FileName.PNG", ApplicationConstants.SCREENS_PATH + "Upload.txt");
			screen.click(ApplicationConstants.SCREENS_PATH + "btn_Open.PNG");
			Thread.sleep(5000);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.quit();
		}
	}
}
