package decesionmaking;

import java.util.Scanner;

public class Example {
	
	
	public static void main(String[] args) {
	
		
		int passmarks = 35;
		int marksobtained;
		char grade;
 
        Scanner src = new Scanner(System.in);
        marksobtained =  src.nextInt();
		src.close();
		

		if(marksobtained>passmarks) {
			if(marksobtained>90) {
				grade='A';
			}
		}else if (marksobtained>75) {
			grade='b';
		}else if (marksobtained>60) {
			grade='c';
			
		}else {
			grade ='d';
			System.out.println("you pass the exam and the grade is " + grade
					+ "/t");
	
		}
		
	
	}
	

}
