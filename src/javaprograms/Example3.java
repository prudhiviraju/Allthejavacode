package javaprograms;



//method with return value and no parameters
public class Example3 {

	
     int add() {
		
		int x = 20;
		int y =30;
		int z =x+y;
		return z;
		
	}
	public static void main(String[] args) {
		
		Example3 ex3 = new Example3();
	
		int sum = ex3.add();
		System.out.println("the value is "+sum);
		
	}
	
}
