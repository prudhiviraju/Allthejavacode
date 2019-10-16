package failedscreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Customlistener.class)
public class Screenshottest extends Baseclass {
	
	
	
	     @BeforeMethod
	 	public void setup() {
	 		
	 		initalization();
	 		
	 	}

	 	@AfterMethod
	 	public void teardown() {
	 		driver.quit();
	 		

	 }
	 	@Test
	 	public void takesscreenshot1() {
	 		
	 		Assert.assertEquals(false,true);
	 	}
	 	
	 	@Test
	 	public void takesscreenshot2() {
	 		
	 		Assert.assertEquals(false,true);
	 	}
	 	
	 	@Test
	 	public void takesscreenshot3() {
	 		
	 		Assert.assertEquals(false,true);
	 	}
}

