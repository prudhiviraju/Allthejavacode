package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonfbimage {

	public static void main(String[] args) {
		
		String baseurl ="https://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.findElement(By.xpath("//div[@class='_5iyy']//img[@class='img']")).click();
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("we are in home page");
			
		}else {
			System.out.println("we are not in home page");
		}
		
		driver.quit();		
		
	}
}
