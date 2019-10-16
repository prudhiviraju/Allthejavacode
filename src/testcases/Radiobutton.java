package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	
	
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\chromedriver_win32\\\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/radio.html");
	driver.findElement(By.id("vfb-7-1")).click();
	
	driver.findElement(By.id("vfb-8-2")).click();
	
	
	System.out.println("radio button 1 is selected");
		
	
	//Radio button no 2
	
	System.out.println("radio button 2 is selected");
		
	
	//checkbox selection
 driver.findElement(By.id("vfb-6-0")).click();
	
	
		
		
	
	
    driver.close();
		
	}
	

}
