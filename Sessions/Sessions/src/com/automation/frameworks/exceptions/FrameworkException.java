package com.automation.frameworks.exceptions;

import com.automation.frameworks.utils.Logger;
import com.automation.frameworks.utils.Reporter;
import com.relevantcodes.extentreports.LogStatus;

@SuppressWarnings("serial")
public class FrameworkException extends Exception {

	public FrameworkException() {

	}

	public FrameworkException(String message) {
		Logger.error(message);
	}

	public FrameworkException(Throwable cause) {
		super(cause);
		Logger.error(cause.toString());
	}

	public FrameworkException(String message, Throwable cause) {
		super(message, cause);
		Logger.error(message + ":" + cause);
	}

	public FrameworkException(Exception exception) {
		Logger.error(exception.toString());
		Reporter.reportEvent(LogStatus.ERROR, "FrameworkException", exception.toString());
	}
}
