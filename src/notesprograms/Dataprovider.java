package notesprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider = "wordpress")
	public void login(String username , String password ) {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//input[contains(@value, 'Log In')]")).click();
		
		
	}
	
	
	
	public void teardown() {
		
		
		driver.quit();
	}
	
	
	
	@DataProvider(name="wordpress")
	public Object[][] dataprovider(){
		Object[][] ob = new Object[2][2];
		
		ob[0][0]="prem";
		ob[0][1]="razz";
		
		ob[1][0]="8331900166";
		ob[1][1]="8331900166";
		
		
		return ob;
		
	}
	
	
	
	
}
