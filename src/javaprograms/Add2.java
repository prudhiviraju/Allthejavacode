package javaprograms;

import java.util.Scanner;

public class Add2 {

	int add(int []b) {
		
		int sum=0;
		
		for(int i =0;i<10;i++) {
			sum =sum+b[i];
			
			
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		
		int add =20;
		
		System.out.println("enter the i value");
		Scanner s = new Scanner(System.in);
		int []a = new int [10];
		for(int i=0;i<10;i++) {
			
			
			a[i]=s.nextInt();
			Add2 ad = new Add2();
			add=ad.add(a);
				System.out.println(add);	
		}
	}
	
}
