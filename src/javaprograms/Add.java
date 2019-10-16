package javaprograms;

public class Add {

	int add (int []b) {
		
		int sum =0;
		for(int i=0;i<b.length;i++) {
			sum=sum+b[i];
			
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		int i;
		int add;
		
		int []a= {10,20,30,40,50};
		Add ad = new Add();
		add =ad.add(a);
		System.out.println(add);
		
				
		
		
	}
	
	}
	
	

