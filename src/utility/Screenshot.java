package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Prudhvi R@zz
 *
 *the purpose is to take screenshot .. To know the Flow of app as per the requirement
 */






public class Screenshot {

public static void capturescreenshot(WebDriver driver, String screenshotname) {
	try {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\screenshotimages\\"+screenshotname+".png");
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		System.out.println("exception while taking the image"+ e.getMessage());
		}
	
}	
	
}
