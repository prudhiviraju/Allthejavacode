package com.automation.coreJava.exceptions;

@SuppressWarnings("serial")

/* This example shows how to write customized exception*/
class RootException extends Exception {

	public RootException(Exception exception) {
		System.out.println("RootException:" + exception.toString());
		System.out.println("RootException:" + exception.getMessage());
	}

}
