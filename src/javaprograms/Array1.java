package javaprograms;

public class Array1 {

	
	
	void display(int[]rollno, String [] name){
		
		
		for ( int i=0;i<=4;i++) { 
			System.out.println(rollno[i]+name[i]);
		}
	}
	public static void main(String[] args) {
		
		Array1 a1 = new Array1();
		int[]arr = {12,13,14,15,16};
		String[]name = {"ravi","prem","razz","king","prudhiv"};
		a1.display(arr, name);
		
	}
	
	
}
