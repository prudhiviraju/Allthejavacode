package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Newpropertycode {

	    Properties pro;
	
	    
	
	public Newpropertycode()  {

		try {
			File file = new File(".test-output/config.property");
			FileInputStream fis = new FileInputStream(file);
		    pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "  + e.getMessage() );
		}
	
	}

	
	public String getchromepath() {
		
		return pro.getProperty("chromedriver"); 
		
	}
	
	
	public String getffpath() {
		return pro.getProperty("geckodriver");
	}
	
	public String getiepath() {
		return pro.getProperty("ie driver");
		
	}
	
	public String geturl() {
		return pro.getProperty("url");
		
	}
	
	public String getusername() {
		return pro.getProperty("username");
		
	}
	
	public String getpwd() {
		return pro.getProperty("password");
	}
	
	
	
	
	
	
	
	
	
}



