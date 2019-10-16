package exception;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;

public class Exception {
	
	
	public static void main(String[] args)    {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // we will get one exception 
		
		// so for this the soultion is we can use base exception or related exception and try catch block for the better practice its
		// better try catac
		
		try {
			Robot rob = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//we will get another exception
		
		
	}

}
