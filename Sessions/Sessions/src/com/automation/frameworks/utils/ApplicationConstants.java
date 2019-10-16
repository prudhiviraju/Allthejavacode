package com.automation.frameworks.utils;

import java.io.File;

public interface ApplicationConstants {

	public static final String projectPath = System.getProperty("user.dir");
	
	public static final String htmlReportsFileName = "ExecutionReports.html";
	
	public static final String screenShotsPath = projectPath + File.separator + "reports" + File.separator + "executionReports" + File.separator+ "screenshots" + File.separator;
	
	public static final String reportsFile = projectPath + File.separator + "reports" + File.separator + "executionReports" + File.separator + htmlReportsFileName;
	
	public static final int maxTimeOut = 10;

}
