package patternandstring;

import java.util.Scanner;

public class ScannerUsing {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no.of rows need to print");
		
		int row=scanner.nextInt();
		System.out.println("Printing the pattern");
		
		
		for(int i =0;i<=row;i++) {
			
			
			for(int j=0;j<=row;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
	}
	
	
}
