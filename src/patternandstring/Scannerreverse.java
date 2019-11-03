package patternandstring;

import java.util.Scanner;

public class Scannerreverse {

	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the value");
		
		int row=scanner.nextInt();
		
	
		
		
		for(int i=0;i<=row;i++) {
			
			for(int j=row;j>i;j--) {
				
				System.out.print(" ");
			}
				for(int k=i;k<=i;k++) {
					
					System.out.print("*");
				}
				System.out.println();
		}
		
		
	}
	
	
	
}
