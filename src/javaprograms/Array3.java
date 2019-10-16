package javaprograms;


//method returning array

public class Array3 {

	public static void main(String[] args) {

		Array3 a3 = new Array3();
		
		int[]res = a3.getrollno();
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	
	
	int[] getrollno() {
		
		int[] arr = {22,314,37,};
		return arr;
		
		
	}
	
}
