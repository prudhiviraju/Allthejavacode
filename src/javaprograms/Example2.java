package javaprograms;




//method without return value and with parameters

public class Example2 {

	
	
	void add(int x , int y) {
		
		
		int z=x+y;
		System.out.println("the value of the z is " + z);
	}
	
	public static void main(String[] args) {
		
		Example2 ex2 = new Example2();
		ex2.add(60, 50);
		
	}
	
	
}
