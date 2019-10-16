package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookFlightPage {
	
	@FindBy(name="passFirst0")
	public static WebElement txtUserName  = null;
	
	@FindBy(name="passLast0")
	public static WebElement txtLastName  = null;
	
	@FindBy(name="pass.0.meal")
	public static WebElement lstMealType  = null;
	
	@FindBy(name="buyFlights")
	public static WebElement btn_SecurePurchase  = null;

}
