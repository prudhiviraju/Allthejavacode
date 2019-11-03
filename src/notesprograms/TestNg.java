package notesprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNg {

	WebDriver driver;
	
	@Parameters({"path"})
	@BeforeTest
	public void setup(String path) {
		
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
		
	}
	
	
	@Test(priority = 0)
	@Parameters({"baseurl","username","password"})
	public void login(String baseurl ,String username , String password ) {
		driver.get(baseurl);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In'and@type='submit']")).click();
		
		
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	
	
}
