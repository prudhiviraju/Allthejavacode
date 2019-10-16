package interviewquestions;

import org.openqa.selenium.WebDriver;

/**
 * 
 * 
 * 
 * @author Admin
 *if we have the multiple alerts presents in the page by using these codes we can resolve the alerts
 */


public class Alert {

	
	public static void resolvealert(WebDriver driver, boolean accept) {
		
		
		if(accept) {
			driver.switchTo().alert();
		}else {
			driver.switchTo().alert().dismiss();
		}
		
		
	}
	
	
	//wrong code
	public void another(WebDriver driver) {
	
		
		
		int retries = 5;

		while (retries > 0) {
		    

		     Alert alert = (Alert) driver.switchTo().alert();
		     alert.accept();

		    retries--;

		}
		
		
		
		
		
		
		
		
		
		
		
	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
