package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error {

	public static void main(String[] args) {
		String baseurl ="https://online.actitime.com/civicon/login.do";
		String un = "prudhiviraju73@gmail.com";
		String pw = "YpasUM";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(baseurl);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		
		
		WebElement a = driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid. Please try again.')]"));
		
		String expected = "Username or Password is invalid. Please try again.";
		String actual = a.getText();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			
			System.out.println("verification is passes");
			
		}else {
			
			System.out.println("verification is failed"); 
			
			
		}
			
		driver.quit();
	}
	
}
