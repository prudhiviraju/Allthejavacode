package interviewquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chartoarray {

	
	public static void main(String[] args) {
		
		
		String input ="";
		
		System.out.println("Enter the String");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			input =br.readLine();
			char[] type1 =input.toCharArray();
			
			for(int i=type1.length-1;i>=0;i--)
				System.out.print(type1[i]);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			}	
}
