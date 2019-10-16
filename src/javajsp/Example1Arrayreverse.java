package javajsp;

import java.util.Scanner;

public class Example1Arrayreverse {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Display elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"  ");
		}System.out.println("reverse the string");
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]+" ");
			
		}
	}
	
}
