package javaprograms;


//method taking as array parameter
public class Array {

	
	void display(int [] temp) {
		for(int x:temp) {
			System.out.println(x);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Array ar = new Array();
		int [] arr = {12,14,15,16,17};
		ar.display(arr);
		System.out.println();
		int [] arr1= {15,25,35,45,55};
		ar.display(arr1);
		
	}
	
	
}
