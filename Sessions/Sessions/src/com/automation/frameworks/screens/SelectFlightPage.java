package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlightPage {

	@FindBy(xpath = "//*[@type ='radio' and contains(@value,'Unified Airlines$363')]")
	public static WebElement rb_From = null;
	
	
	@FindBy(xpath = "//*[@type ='radio' and contains(@value,'Unified Airlines$633')]")
	public static WebElement rb_To = null;
	
	@FindBy(name = "reserveFlights")
	public static WebElement btn_Continue = null;
	

}
