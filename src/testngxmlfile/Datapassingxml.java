package testngxmlfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Datapassingxml {
	
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void passingdata(String browser ,String url,String username,String password) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();			
		}else if (browser.equalsIgnoreCase("ff")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
		
		
		
		
	}
	
	

}
