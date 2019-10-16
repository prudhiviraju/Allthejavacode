package javaprograms;



//method with return value and with parameters
public class Example4 {

	int add(int x , int y) {
		
		int z = x+y;
		return z;
		
	}
	
	public static void main(String[] args) {
		
		Example4 ex4 = new Example4();

		int sum =ex4.add(50, 60);
		System.out.println("the value is "+ sum);
		
	}
	
}
