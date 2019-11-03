package patternandstring;

import javajsp.Char;

public class Reversethestring {

	
	//two methods that we are written over here how to reverse the string
	
	public static void main(String[] args) {
		
		String name = "prudhvi razz";
		
		
//		StringBuilder b = new StringBuilder(name);
//		System.out.println(b.reverse());
//		
		
		
		char[] na=name.toCharArray();
		for(int i=na.length-1;i>=0;i--) {
			System.out.print(na[i]);
		}
			
		
		
		
	}
	
	
}
