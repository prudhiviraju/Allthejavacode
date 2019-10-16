package testcases.checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pancard {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Selenium\\\\Latest Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.applypanonline.com");
		WebElement link = driver.findElement(By.xpath("//a[@id='navmenu-2']"));
		link.click();
		
		
		WebElement before =driver.findElement(By.xpath("//input[@id='chkincome']"));
		
		System.out.println("before click" + before.isSelected());
		
		before.click();
		
		Thread.sleep(3000);
		
		
		
		System.out.println("after selected" + before.isSelected() );
		
		
		driver.quit();
	}
	
}
