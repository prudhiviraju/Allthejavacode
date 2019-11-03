package notesprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conditional2 {
	/**
	 * 
	 * @param There are two conditional Statements if one Statement if fail that will not print and it'll Goes to next Conditional
	 * Statement
	 */

	public static void main(String[] args) {
		
		
	WebDriver driver;
    String input ="chrome";

    
    System.out.println("the program is going to start");
    
    if(input.equalsIgnoreCase("ff")) {

    	
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
    	driver= new FirefoxDriver();
    	driver.get("https://www.google.com");
    	
    	System.out.println("this Statement is not going to Print");
    	
    }else{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\Latest Drivers\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	
    	System.out.println("this statement is going to print");
    	
    	driver.quit();
    }
		
    System.out.println("the program is end");
		
	}
	
}
