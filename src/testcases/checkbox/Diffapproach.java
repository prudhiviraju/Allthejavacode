package testcases.checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Diffapproach {
	
	
	WebDriver driver;

	@Test
	public void diif() {
	

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\Latest Drivers\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.applypanonline.com");
		driver.findElement(By.xpath("//a[@id='navmenu-2']")).click();
		WebElement income= driver.findElement(By.xpath("//input[@id='chkincome']"));
		check(income);
		
		System.out.println("the checkbox is " + income.isSelected());
		
		uncheck(income);
		System.out.println("the check box is"  + income.isSelected());
		
		driver.quit();
		
		
	}

	private static void check(WebElement element) {
		
		try{
		
			if(!element.isSelected()) {
				element.click();
			}
			
		} catch (Exception e) {
		System.out.println("the error is" + e.toString());
		}
		
	}
	
	private static void uncheck(WebElement element) {
		
		try {
			
			if(element.isSelected()) {
				element.clear();
			}
			
			
		} catch (Exception e) {
			System.out.println("the thing is " + e.toString());
		}
		
	}
	
	
}
