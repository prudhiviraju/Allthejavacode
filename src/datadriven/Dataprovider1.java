package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	
	
	
	WebDriver driver;
	
	@Test(dataProvider = "dataprovider")
	public void datadriven(String username , String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Latest Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(7000);
		String title =driver.getTitle();
		Assert.assertEquals(title,"Guru99 Bank Manager HomePage");
		
		
	}
	
        @AfterMethod   	
		public void teartown() {
			
			driver.quit();
		}
		
	
	
	@DataProvider(name="dataprovider")
	public Object[][] Data(){
		
		Object[][] data = new Object[4][2];
		
		data[0][0]="admin";
		data[0][1]="password";
		
		data[1][0]="prudhvi";
		data[1][1]="25445";
		
		
		data[2][0]="razz";
		data[2][1]="9440077060";
		
		data[3][0]="mngr2236710";
		data[3][1]="bubusuz";
		
		return data;
		
		
		
		
	}
	

}
