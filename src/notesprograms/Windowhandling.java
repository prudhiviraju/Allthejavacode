package notesprograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandling {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\"
				+ "geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
		
		
		driver.get("https://www.naukri.com/");
		
		String Current =driver.getWindowHandle();
		System.out.println(Current);
		
		Set<String> allwindow =driver.getWindowHandles();
		System.out.println(allwindow);
		
		Iterator<String> ite =allwindow.iterator();
		
		while(ite.hasNext()) {
			
			String windowid1=ite.next();
			String title=driver.switchTo().window(windowid1).getTitle();
			
			System.out.println(title);
		}
		
		driver.quit();
	}
	
}
