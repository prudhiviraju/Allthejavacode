package windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Dimension dim = new Dimension(500,500 );
		driver.manage().window().setSize(dim);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
		driver.get("https://www.google.com");
		
		driver.quit();
		
	}
	
	
}
