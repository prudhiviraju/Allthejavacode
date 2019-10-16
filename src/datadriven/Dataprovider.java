package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	

	   ChromeDriver driver;
	
	   
	   @Test(dataProvider = "wordpress")
	public void datadriven(String username , String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/civicon/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(7000);
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("actiTIME - Enter Time-Track"),"user not able to login its an invalid credentials");
	}	
	
	
	   @AfterMethod
	   public void teardown() {
		   
		   driver.quit();
	   }
	
	@DataProvider(name="wordpress")
	public Object[][] passdata(){
		
	Object[][] data = new Object[3][2];
				
				data[0][0]="admin";
		        data[0][1]="password";	
		        		
		        data[1][0]="admin";
		        data[1][1]="password";
		        
		        data[2][0]="prudhiviraju73@gmail.com";
		        data[2][1]="YpasUMER";

		        return data;
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
