package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsers {

	WebDriver driver = null;
	
	
	@Test
	@Parameters("browser")
	public void Crossbrowser(String bn) throws Throwable {
	
		if(bn.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (bn.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (bn.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		
		Thread.sleep(5000);
		driver.get("https://www.amazon.in");
		
		
		
		
		
		driver.quit();
		
		
		
		
		
	}
}
