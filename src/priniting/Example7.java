package priniting;

import java.util.Scanner;

public class Example7 {

	
	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num");
		num=scan.nextInt();
		
		if(num%2==0) {
			
			System.out.println("that is even num");
		}else {
			System.out.println("not even num");
		}
		
		
	}
}
