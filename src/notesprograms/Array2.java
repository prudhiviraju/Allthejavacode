package notesprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Array2 {


	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		
		String[] name= new String[3];
		name[0]="chrome";
		name[1]="ff";
		name[2] = "ie";
		for(String browsername: name) {
			
			switch (browsername) {
			case "chrome":
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			break;
			
			case "ff":
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
				
				driver = new FirefoxDriver();

			
				break;
				
			case "ie":
				System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				
				driver = new InternetExplorerDriver();
			break;
			
			}
			
			
			
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		Thread.sleep(5000);
		driver.quit();
		}
		
		
		
	}
	
	

