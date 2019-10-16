package links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links2 {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/link.html");
		driver.findElement(By.linkText("click here")).click();
		
		

		
		
		
		
	}
	
}
