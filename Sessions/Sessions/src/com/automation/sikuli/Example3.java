package com.automation.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to use sikulli methods */
class Example3 {

	@Test
	public void rightClick(){
		
		WebDriver driver = null;
		
		try {

			System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);

			driver = new ChromeDriver();

			driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
			
			driver.manage().window().maximize();
			
			Screen screen = new Screen();
			
			screen.setAutoWaitTimeout(60);
			
			screen.rightClick(ApplicationConstants.SCREENS_PATH+ "btn_RightClick.PNG");
			
			screen.click(ApplicationConstants.SCREENS_PATH + "copy.PNG");
			
			screen.click(ApplicationConstants.SCREENS_PATH + "btn_OK.PNG");

			Thread.sleep(20000);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.quit();
		}

	}

}
