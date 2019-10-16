package com.automation.selenium.utils;

import java.io.File;

public interface ApplicationConstants {
	
	public static final String RESOURCES_PATH = System.getProperty("user.dir")+ File.separator+ "resources"+ File.separator ;
	
	public static final String DRIVERS_PATH = RESOURCES_PATH + "drivers" + File.separator;
	
	public static final String TESTDATA_PATH = RESOURCES_PATH + "testData" + File.separator;
	
	public static final String ALERTS_PATH = RESOURCES_PATH+ "alerts" + File.separator;
	
	public static final String SYNC_PATH = RESOURCES_PATH + "sync" + File.separator;
	
	public static final String FILES_PATH = RESOURCES_PATH+ "files" + File.separator;
	
	public static final String SCREENS_PATH = RESOURCES_PATH + "screens" + File.separator;
	
	public static final String EXE_PATH = RESOURCES_PATH + "autoIt" + File.separator;
			
	public static final String CHROME_DRIVER = DRIVERS_PATH + "chromedriver.exe";

	public static final String FIREFOX_DRIVER = DRIVERS_PATH + "geckodriver.exe";
	
	public static final String EDGE_DRIVER= DRIVERS_PATH + "MicrosoftWebDriver.exe";
	
	public static final String IE_DRIVER= DRIVERS_PATH + "IEDriverServer.exe";
	
	public static final String OPERA_DRIVER= DRIVERS_PATH + "operadriver.exe";
	
	public static final String SAFARI_DRIVER= DRIVERS_PATH + "safaridriver.exe";
		
	public static final String TESTDATA_XLS = TESTDATA_PATH + "ApplyPanOnline.xls";
	
	public static final String TestData_XLSX = TESTDATA_PATH + "ApplyPanOnline.xlsx";

}
