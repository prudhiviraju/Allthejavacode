package windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwindoe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
		
		driver.get("https://www.irctc.co.in/nget/train-searc");
		driver.findElement(By.id("loginText")).click();
		Alert alert =driver.switchTo().alert();
		driver.findElement(By.id("userId")).sendKeys("prudhvirazz");
		
		
	}
	
	
}
