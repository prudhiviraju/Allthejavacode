package com.automation.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

class TC02_MercuryRegister {

	@Test
	public static void createAccount() {
		
		System.setProperty("webdriver.chrome.driver", ApplicationConstants.CHROME_DRIVER);

		/* Create instance of chrome driver */
		ChromeDriver driver = new ChromeDriver();

		/* To open browser */
		driver.get("http://newtours.demoaut.com");

		/* Click on Link Register */
		driver.findElementByLinkText("REGISTER").click();

		/* Enter FirstName */
		driver.findElementByName("firstName").sendKeys("SRIKRISHNA");

		/* Enter LastName */
		driver.findElementByName("lastName").sendKeys("ADUSUMALLI");

		/* Enter Phone Number */
		driver.findElementByName("phone").sendKeys("9123456789");

		/* Enter Email */
		driver.findElementById("userName").sendKeys("gmail@gmail.com");

		/* Enter Address */
		driver.findElementByName("address1").sendKeys("HyderNagar");

		/* Enter City */
		driver.findElementByName("city").sendKeys("Hyderabad");

		/* Enter State */
		driver.findElementByName("state").sendKeys("Telangana");

		/* Enter Postal Code */
		driver.findElementByName("postalCode").sendKeys("500090");

		/* Enter Country */
		driver.findElementByName("country").sendKeys("INDIA");

		/* Enter UserName */
		driver.findElementByName("email").sendKeys("mercury");

		/* Enter Password */
		driver.findElementByName("password").sendKeys("mercury");

		/* Enter Confirm Password */
		driver.findElementByName("confirmPassword").sendKeys("mercury");

		/* Click on Submit button */
		driver.findElementByName("register").click();

		/* Click on Sign in link */
		driver.findElementByLinkText("sign-in").click();

		/* Enter user name */
		driver.findElementByName("userName").sendKeys("mercury");

		/* Enter password */
		driver.findElementByName("password").sendKeys("mercury");

		/* click on submit button */
		driver.findElementByName("login").click();

		/* click on sign off button */
		driver.findElementByLinkText("SIGN-OFF").click();

		/* To close browser */
		driver.close();

	}

}
