import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class Newtab {
	
	
	
	public void opennewtab() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop"
				+ "\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		
		   WebDriver driver;
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
				
		
		    driver = new ChromeDriver(); 
		    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		    driver.findElement(By.tagName("body")).sendKeys(selectLinkOpeninNewTab);

		    driver.get("www.facebook.com");
	}

}
