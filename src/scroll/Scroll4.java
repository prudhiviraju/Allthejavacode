package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
			
			WebElement element =driver.findElement(By.xpath("//a[contains(text(),'VBScript')]"));
			js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
}
