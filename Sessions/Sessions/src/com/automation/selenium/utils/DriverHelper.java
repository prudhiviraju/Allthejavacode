package com.automation.selenium.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/* Example to show how to write methods*/
public class DriverHelper {

	public static WebDriver getDriver(String browserName) {

		WebDriver driver = null;

		try {
			if (browserName.equalsIgnoreCase("CHROME")) {
				System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}
		return driver;
	}

	public static WebDriver getChromeDriver() {
		ChromeDriver driver = null;
		try {
			System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}
		return driver;
	}

	public static FirefoxDriver getFFDriver() {
		FirefoxDriver driver = null;
		try {
			System.setProperty("webdriver.gecko.driver", ApplicationConstants.FIREFOX_DRIVER);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}
		return driver;
	}

	public static InternetExplorerDriver getIEDriver() {
		InternetExplorerDriver driver = null;
		try {
			System.setProperty("webdriver.ie.driver", ApplicationConstants.IE_DRIVER);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		} catch (Exception exception) {
			System.out.println("Exception Message:" + exception.toString());
		}
		return driver;
	}

	public static void highlightObject(WebDriver driver, WebElement webElement) throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		for (int count = 1; count <= 1; count++) {
			jsExecutor.executeScript("arguments[0].style.border='4px groove red'", webElement);
			Thread.sleep(1000);
			jsExecutor.executeScript("arguments[0].style.border='4px groove yellow'", webElement);
			Thread.sleep(1000);
			jsExecutor.executeScript("arguments[0].style.border=''", webElement);
		}
	}

	public static void maximize(WebDriver driver) {
		try {
			driver.manage().window().maximize();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void pageLoadTimeOut(WebDriver driver, int timeoutInSeconds) {
		try {
			driver.manage().timeouts().pageLoadTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void implicitWait(WebDriver driver, int timeoutInSeconds) {
		try {
			driver.manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
