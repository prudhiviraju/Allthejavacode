package instancemethods;

public class Evenorood2 {

	private int startnum =1;
	private int endnum =100;
	
public void anotherformat(int startnum ,int endnum) {
		
		this.startnum=startnum;
		this.endnum=endnum;
		
	}
	
	
	public void evenorodd() {
		
		while(startnum!=endnum) {
			
			
			if(startnum%2==0) {
				System.out.println("this is even"+startnum);
			}else {
				System.out.println("this is odd"+startnum);
			}
			
			startnum++;
		}	
		
	}
	public static void main(String[] args) {
		Evenorood2 e = new Evenorood2();
		e.anotherformat(1, 1000);
		e.evenorodd();
	}	
	
}
