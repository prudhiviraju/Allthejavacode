package instancemethods;

public class Evenorodd {

	
	private int startnum=1;
	private int endnum=100;
	
	
	public void evenorodd() {
	
		while (startnum!=endnum) {
		

			if(startnum % 2 ==0) {
				System.out.println("the given number  "+startnum+"  is even");
			}else {
				System.out.println("the given number  "+startnum+"  is odd");
			}

			startnum++;
			
			
		}

		}
		
			
	
public static void main(String[] args) {
	
	Evenorodd e = new Evenorodd();
	e.evenorodd();
	
	}
	
}
