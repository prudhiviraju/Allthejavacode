package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Testng {

	static String url = "https://www.facebook.com/";
	WebDriver driver ;
	static String first = "prudhiviraju";
	static String surname ="yeddula";
	static String mobile ="8331900166";
	static String pass="FUCKYOU25";

	@Test
	public void base() {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\chromedriver_win32\\\\chromedriver.exe" );
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
}

	@Test(priority = 1)
	public void url() {
		driver.get(url);
		driver.findElement(By.id("u_0_m")).sendKeys(first);
		driver.findElement(By.id("u_0_o")).sendKeys(surname);
		driver.findElement(By.id("u_0_r")).sendKeys(mobile);
		driver.findElement(By.id("u_0_y")).sendKeys(pass);
		
		
	}
	
	@Test(priority = 2)
	public void screenshot()   {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\screenshotimages\\razz1.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			System.out.println("the error message is " + e.getMessage());
				}
		
		
		
		
	}
	
	@Test(priority = 3)
	public void teardown() {
		driver.quit();
	}
}
