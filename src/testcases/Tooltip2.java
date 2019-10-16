package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip2 {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Deskto"
				+ "p\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/tooltip.html");
		
		WebElement download =driver.findElement(By.xpath("//a[@id='download_now']"));
		
		Actions buider = new Actions(driver);
		buider.moveToElement(download).build().perform();
		driver.quit();
		
		
	}
	
}
