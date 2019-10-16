package windows;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		int list =driver.findElements(By.tagName("iframe")).size();
		System.out.println(list);
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='https:/www.youtube.com/embed/lYCEQqSM08I']	"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//body[contains(@class,'logo-type-preset4 fixed-header-enabled-0 showcase-overlay-dark showcase-type-preset1 feature-overlay-light maintop-overlay-dark main-body-style-light mainbottom-overlay-light footer-overlay-light footer-type-preset8 font-family-droid-sans font-size-is-xlarge menu-type-dropdownmenu layout-mode-responsive col12 option-com-content menu-home')]")).click();
		
	} 
	
	
}
