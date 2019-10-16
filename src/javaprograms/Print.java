package javaprograms;

public class Print {

	double max(double[]b){
		double max;
		max=b[0];
		
		
		for(int i =0;i<b.length;i++) {
			
			
			if(b[i]>max) {
				
				max=b[i];
			}
		
			
		}
		return max;		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		int i;
		double high;
		double a[] = {2.2,3.3,4.5,6.5,};
		Print p = new Print();
	    high =p.max(a);
	    System.out.println(high);
		
	}
}
