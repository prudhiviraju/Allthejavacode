package links;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link1 {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		
		System.out.println(links.size());
		
		for(WebElement link:links ) {
			
			System.out.println(link.getText() + "  ---  "+ link.getAttribute("href"));
			
		}
		
		
		driver.quit();
		
		
	}
	
}
