package com.automation.frameworks.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "userName")
	public static WebElement txt_UserName;

	@FindBy(name = "password")
	public static WebElement txt_Password;

	@FindBy(name = "login")
	public static WebElement btn_SignOn;

}
