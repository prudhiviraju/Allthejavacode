package webtable;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		
		String before="//*[@id=\"content\"]/table/tbody/tr[";
		String after ="]/th";
		
		for(int i=1;i<=4;i++) {
			
			String actualxpath=before+i+after;
			WebElement element =driver.findElement(By.xpath(actualxpath));
			System.err.println(element.getText());
		}
		

		
		//*[@id="content"]/table/tbody/tr[1]/th
		//*[@id="content"]/table/tbody/tr[2]/th
		//*[@id="content"]/table/tbody/tr[3]/th

		//*[@id="content"]/table/tbody/tr[4]/th
		//*[@id="content"]/table/tfoot/tr/th

		
		for(int i =1;i<=4;i++) {
			
			String xpath1 ="]/td[1]";
			String originalxpath=before+i+xpath1;
		    WebElement element1 =driver.findElement(By.xpath(originalxpath));
		
		    System.out.println(element1.getText());
		}
		
		
		
		java.util.List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"content\"]/table/tbody/tr"));
		int i =rows.size();
		System.out.println(i);
		
		
		
		////*[@id="content"]/table/tbody/tr[1]/td[1]////*[@id="content"]/table/tbody/tr[2]/td[1]
		////*[@id="content"]/table/tbody/tr[4]/td[1]
		
		//for column
		//*[@id="content"]/table/thead/tr/th[1]
		//*[@id="content"]/table/thead/tr/th[6]
		//*[@id="content"]/table/thead/tr/th[7]
		
		
		
		
		java.util.List<WebElement> col =driver.findElements(By.xpath("//*[@id=\"content\"]/table/thead/tr/th"));
		System.out.println(col.size());
		
	for(int j =1;j<=7;j++) {
		String beforex="//*[@id=\"content\"]/table/thead/tr/th[";
		String afterx="]";
		
			String org=beforex+j+afterx;
			WebElement ele =driver.findElement(By.xpath(org));
			System.out.println(ele.getText());
		
			
		}
		
		
	driver.quit();
		
		
		
		
		
		
		
			}
	
	
}
