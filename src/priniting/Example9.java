package priniting;

public class Example9 {
	
	
	
	public static void main(String[] args) {
		
		for(int i =0;i<100;i++) {
			
			boolean isprime =true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime)
				System.out.println("this is the prime num "+ i);
		}
	}

}
