package notesprograms;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Conditional3 {

	
	
	public static void main(String[] args) {
		
	String browsername="chrome";
	WebDriver driver = null;
	
	System.out.println("the program is start");
		
	
	if(browsername.equalsIgnoreCase("ff")) {
		
		System.setProperty("webdriver.gecko.driver","‪C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	
		
	}else if(browsername.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		
		
	}else if (browsername.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	
	
	driver.quit();
	
	}
	
}
