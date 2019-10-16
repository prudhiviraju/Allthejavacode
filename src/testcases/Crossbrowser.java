package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 
 * @author Prudhvi R@zz
 *  Cross browser testing when the code part is done and we have to create xml file over there we have 
 *  <test thread-count="5" name="chromeTest"> 
  <parameter name = "browser" value = "chrome"/> on which browser we have to run	
  <classes>
  <class name = "testcases.Crossbrowser"/>   this is package name and the class name 
  </classes>
  	
  </test> <!-- Test -->   
  
  
  
  <suite name="Suite" parallel = "tests">   this thing is going to do parallel run in all browsers
  <test thread-count="5" name="chromeTest"> 
  <parameter name = "browser" value = "chrome"/>	
  <classes>
  <class name = "testcases.Crossbrowser"/>
  </classes>
  	
  </test> <!-- Test -->
  
 */




public class Crossbrowser {

	WebDriver driver;
@Test
@Parameters({"browser"})
	public void verify(String browsername) {	
	
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\freecrmtest\\drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		
		
	}else if (browsername.equalsIgnoreCase("FF")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\freecrmtest\\drivers\\geckodriver.exe" );
		driver = new FirefoxDriver();
		
	}else if (browsername.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\freecrmtest\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.quit();
	
	
	
	
	
	
	
}
	
}
