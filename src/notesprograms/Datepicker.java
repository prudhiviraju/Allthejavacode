package notesprograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	
	
	static WebDriver driver =null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		
		List<WebElement> list =driver.findElements(By.xpath("//table"));
		
		System.out.println(list.size()+ "the size of the table");
		

		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath("//a[text()='23']")).click();
		
		
		WebElement element =driver.findElement(By.xpath("//table[1]"));
		System.out.println(element.getText() + "gettting the text from the first table");
		
		
		
		
		
		
		driver.quit();
	}
	

}
