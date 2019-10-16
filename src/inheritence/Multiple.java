package inheritence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multiple {

	
	private static WebDriver driver = null;
	
	
	public WebDriver launchbrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}else if (browsername.equalsIgnoreCase("ff")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (browsername.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
