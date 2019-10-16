package javaprograms;


public class Add3 {

	int add(int[]c,int[]d) {
		
		int i=0;
		int e[]= new int[5];
		
		for(int i1=0 ;i1<5;i1++) {
			
			e[i1]=c[i1]*d[i1];
			System.out.println("result of"+e[i1]);
			
		}
		return i;
	}
	public static void main(String[] args) {
		
		
		Add3 ad = new Add3();
		int[]a= {10,20,30,40,50};
		int []b= {60,70,80,90,100};
		ad.add(a, b);
	}
	
	
}
