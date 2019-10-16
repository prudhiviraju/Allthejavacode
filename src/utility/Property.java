package utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public class Property {

	
	

	Properties pro;
	public Property() throws Exception
	{
		File file = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\datafile.property");
		FileInputStream fis = new FileInputStream(file);
		pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
		System.out.println("error message"+e.getMessage());
		}
	
	}
		
	public String url(){
	return pro.getProperty("url");
	
	}	
	
	public String username(){
	
	return pro.getProperty("username");
}

public String password(){
return pro.getProperty("password");
}


public String exe(){
return pro.getProperty("gecko");

}








}






















