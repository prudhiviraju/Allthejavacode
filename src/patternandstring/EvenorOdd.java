package patternandstring;

import java.util.Scanner;


/**
 * 
 * @author Admin
 *  the commented code is also work and the ways of extract the code
 */
public class EvenorOdd {

	public static void main(String[] args) {
		
//		Scanner scnner = new Scanner(System.in);
//		System.out.println("eneter the number");
//
//
//		int i =scnner.nextInt();
//		
		
		for(int i=0;i<=100;i++)
		if((i%2)==0) {
			System.out.println("the num is even " + i);
		}else {
			System.out.println("the number is not even " + i);
		}
		
		
		
	}
}
