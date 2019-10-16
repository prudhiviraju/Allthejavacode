package com.automation.autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/*Enter file name and then click on windows open button*/
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
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\btn_Open.exe");
			Thread.sleep(5000);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			driver.quit();
		}

	}
}
