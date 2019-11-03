package notesprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Frames {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");


		
		List<WebElement> list =driver.findElements(By.tagName("frame"));
		System.out.println(list.size());

		WebElement frame =driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[contains(text(),'ActiveSession')]")).click();
		
		driver.quit();
		
		
		
		
	}

}
