package com.automation.frameworks.utils;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.frameworks.helper.DriverHelper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter{
	
	public static ExtentReports extent;
	public static Map<Long, String> threadToExtentTestMap = new HashMap<Long, String>();
	public static Map<String, ExtentTest> nameToTestMap = new HashMap<String, ExtentTest>();

	public static ExtentReports getReport() {
		try {
			if (extent == null) {
				extent = new ExtentReports(ApplicationConstants.reportsFile, true);
				extent.addSystemInfo("Host Name", "")
					  .addSystemInfo("Environment", "");
			}
		} catch (Exception exception) {
			return null;
		}
		return extent;
	}

	public static ExtentTest getTest() {
		Long threadID;
		threadID = Thread.currentThread().getId();
		if (threadToExtentTestMap.containsKey(threadID)) {
			String testName = threadToExtentTestMap.get(threadID);
			return nameToTestMap.get(testName);
		}
		return null;
	}

	public  static ExtentTest getTest(String testName) {
		return getTest(testName, "");
	}
	
	public  static ExtentTest getTest(String testName, String testDescription) {
		if (!nameToTestMap.containsKey(testName)) {
			Long threadID = Thread.currentThread().getId();
			ExtentTest test = getReport().startTest(testName, testDescription);
			nameToTestMap.put(testName, test);
			threadToExtentTestMap.put(threadID, testName);
		}
		return nameToTestMap.get(testName);
	}
	public static void startScript(String scriptName){
		getTest(scriptName).log(LogStatus.INFO, "[" + scriptName + "]","[" + scriptName + "]");
	}
	
	public synchronized static void endScript(){
		ExtentTest test = null;
		test = getTest();
		test.log(LogStatus.INFO,"[/" + test.getTest().getName() + "]","[/" + test.getTest().getName() + "]" );
		if (test != null) {
			getReport().endTest(test);
			extent.flush();
		}
	}
	public synchronized static ExtentReports getReporter(String filePath) {
		try {
			if (extent == null) {
				extent = new ExtentReports(filePath, false);
				extent.addSystemInfo("Host Name", "").addSystemInfo("Environment", "");
			}
		} catch (Exception exception) {
			return null;
		}
		return extent;
	}
	
	public static void reportEvent(LogStatus status,String stepName, String stepDescription) {
		String screenShotPath = null;
		String newStepName = stepName.replace("<", "").replace(">", "");
		if((status.equals(LogStatus.FAIL))| (status.equals(LogStatus.ERROR))| (status.equals(LogStatus.PASS))){
			screenShotPath = getScreenshot();
			getTest().log(status,newStepName,stepDescription+ getTest().addScreenCapture(screenShotPath));
				if(status.equals(LogStatus.FAIL)){
					Assert.fail(stepDescription);
				}
		}
		else{
			getTest().log(status,newStepName,stepDescription);
		}
	}
	
	public static String getScreenshot() {
		File srcFile,destFile = null;
		try{
			WebDriver webDriver = DriverHelper.getWebDriver();
			srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
			destFile = new File(ApplicationConstants.screenShotsPath + new Timestamp(new Date().getTime()).toString().replace(" ", "").replace(":", "_").replace(".","_") +".jpg");
			FileUtils.copyFile(srcFile, destFile);
		}catch(Exception exception){
			return null;	
		}
		return destFile.getAbsolutePath();
	}

}
