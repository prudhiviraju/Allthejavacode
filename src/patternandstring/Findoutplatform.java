package patternandstring;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.jdi.connect.spi.TransportService.Capabilities;

public class Findoutplatform {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://gaana.com/");
		
		org.openqa.selenium.Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
		
		String browser =cap.getBrowserName().toLowerCase();
		System.out.println(browser);

		
		
		String plat =cap.getPlatform().toString();
		System.out.println(plat);
		
		
		
		String ver =cap.getVersion().toUpperCase();
		System.out.println(ver);
		
		
		
		
		driver.quit();
		
	}
	
}
