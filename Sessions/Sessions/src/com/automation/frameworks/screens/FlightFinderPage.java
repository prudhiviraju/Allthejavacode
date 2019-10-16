package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightFinderPage {

	@FindBy(xpath = "//*[text()='SIGN-OFF']")
	public static WebElement lnk_SignOff;

	@FindBy(xpath = "//*[@value='oneway']")
	public static WebElement rb_OneWay;

	@FindBy(name = "passCount")
	public static WebElement lst_Passengers;

	@FindBy(xpath = "//*[@value='Business']")
	public static WebElement rb_Business;

	@FindBy(name = "findFlights")
	public static WebElement btn_Continue;
	

}
