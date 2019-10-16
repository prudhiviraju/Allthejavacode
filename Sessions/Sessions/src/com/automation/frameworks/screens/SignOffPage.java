package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOffPage {

	@FindBy(xpath = "//*[text()='SIGN-OFF']")
	public static WebElement btnSignOff = null;

	@FindBy(xpath = "//*[contains(text(),'itinerary has been booked!')]")
	public static WebElement txtMessage = null;
}
