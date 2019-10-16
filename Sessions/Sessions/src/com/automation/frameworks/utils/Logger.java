package com.automation.frameworks.utils;

public class Logger {
	
	private static org.apache.log4j.Logger Log = org.apache.log4j.Logger.getLogger(Logger.class.getName());
	
	public static void info(String message) {
		Log.info(message);
	}

	public static void warn(String message) {
		Log.warn(message);
	}

	public static void error(String message) {
		Log.error(message);
	}

	public static void fatal(String message) {
		Log.fatal(message);
	}
	
}