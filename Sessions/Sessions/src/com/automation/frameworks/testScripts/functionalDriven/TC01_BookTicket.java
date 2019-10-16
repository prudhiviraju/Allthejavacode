package com.automation.frameworks.testScripts.functionalDriven;

import org.testng.annotations.Test;

import com.automation.frameworks.core.FrameworkScript;
import com.automation.frameworks.helper.ActionsHelper;

/* This example shows how to implement automation scripts by using Functional Driven */
class TC01_BookTicket extends FrameworkScript {

	@Test
	public void bookTicket() {

		try {

			driver.get("http://newtours.demoaut.com/");
			
			ActionsHelper.login("mercury", "mercury");
			
			ActionsHelper.findFlight();
			
			ActionsHelper.selectFlight();
			
			ActionsHelper.bookTicket("scott","tiger");
			
			ActionsHelper.signOff();

		} catch (Exception exception) {
			System.out.println("Exception:" + exception.toString());
		} 
	}

}
