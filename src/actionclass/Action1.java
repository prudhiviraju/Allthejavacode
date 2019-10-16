package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Action1 {

	
	private static String baseurl="https://www.facebook.com";
	private static String chromedrive="C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe";
	private static WebDriver driver;
	private static String expected ="Please enter a valid mobile number or email address.";
	
	
	@Test
	public static void razz() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",chromedrive);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.findElement(By.name("firstname")).sendKeys("prudhvi");
		driver.findElement(By.name("lastname")).sendKeys("razz");
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("25445");
		driver.findElement(By.name("websubmit")).click();
		WebElement element =driver.findElement(By.xpath("//div[@id='js_24a']"));
		
		String actual=element.getText();
		
		Assert.assertEquals(expected, actual);
		
	

		driver.quit();
		
		
	}
	
}
