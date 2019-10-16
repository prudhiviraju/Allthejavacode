package javaprograms;

public class Printlow {

	int min(int[]b) {
		int min;
		min=b[0];
		for(int i=0;i<b.length;i++) {
			
			if(b[i]<min) {
				
				min=b[i];
			}
		}return min;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int i;
		int low;
		int[]a= {10,20,30,40,50};
		Printlow p = new Printlow();
		low =p.min(a);
		System.out.println(low);
		
	}
	
}
