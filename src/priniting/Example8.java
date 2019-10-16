package priniting;

public class Example8 {

	public static void main(String[] args) {
		
		int startnum=1;
		int endnum=100;
		while(startnum!=endnum) {
			
			if(startnum%2==0) {
				System.out.println("even number " + startnum);
			}else {
				System.out.println("not even "+ startnum);
			}
			startnum++;
		}
		
		
	}
	
	
}
