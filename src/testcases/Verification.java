package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

public static void main(String[] args) throws InterruptedException {
	String baseurl ="https://online.actitime.com/civicon/login.do";
	String un = "prudhiviraju73@gmail.com";
	String pw = "YpasUMER";
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.get(baseurl);
	
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	
	String expected ="actiTIME - Enter Time-Track";	
	String actual = driver.getTitle();
System.out.println(actual);
	
	if(expected.equals(actual)) {
		System.out.println("login page is verified");
	}else {
		System.out.println("login page is not verified");
		
	}
	
	
	driver.close();
	
}	
	
	
	
	
}
