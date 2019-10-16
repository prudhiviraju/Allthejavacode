package inheritence;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Inheritence {

	
	
	 WebDriver driver;
	@Test
	public void main() {
		
		Multiple m = new Multiple();
		driver = m.launchbrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		
	}
	
}
