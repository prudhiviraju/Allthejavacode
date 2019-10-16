package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	
	static String expected ="Sign up for Facebook | Facebook";
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Deskt"
				+ "op\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element =driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		
		js.executeScript("arguments[0].scrollIntoView();",element);
		element.click();
		String actual =driver.getTitle();
		System.out.println(actual);
	
		if(actual.equals(expected)) {
			System.out.println("the testcase is passed");
			
		}
		
			driver.quit();
		
		
	}
	
}
