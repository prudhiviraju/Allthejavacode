package com.automation.frameworks.helper;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.automation.frameworks.exceptions.FrameworkException;

public class DriverHelper {

	private static Map<Long, WebDriver> threadToDriver = new HashMap<Long, WebDriver>();

	/* To Save WebDriver object */
	public static void setWebDriver(WebDriver webDriver) {
		Long threadID;
		try {
			threadID = Thread.currentThread().getId();
			if (!threadToDriver.containsKey(webDriver)) {
				threadToDriver.put(threadID, webDriver);
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
	}

	/* To Retrieve WebDriver object */
	public static WebDriver getWebDriver() {
		Long threadID;
		try {
			threadID = Thread.currentThread().getId();
			if (threadToDriver.containsKey(threadID)) {
				return threadToDriver.get(threadID);
			}
		} catch (Exception exception) {
			new FrameworkException(exception);
		}
		return null;
	}

}
