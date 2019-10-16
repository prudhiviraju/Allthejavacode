package constructor;

public class Example {
	
	
	private String Empname;
	private String Compname;
	private String Mobile;
	private String Empid;
	
	public Example(String empname , String compname , String mobile , String empid) {
		
		this.Empname=empname;
		this.Compname=compname;
		this.Mobile=mobile;
		this.Empid=empid;	
		
	}
	
	
public Example(String empname , String compname , String mobile ) {
		
		this.Empname=empname;
		this.Compname=compname;
		this.Mobile=mobile;
		
	}
	
	
	
public void display() {
	
	System.out.println("the empname is" + Empname + "/t");
	System.out.println("the compnaem is " + Compname + "/t");
	System.out.println("the mobile num is" + Mobile +"/t");
	System.out.println("the empid is "+Empid + "/t");
}



public static void main(String[] args) {
	
	
	
	Example e1 = new Example("razz","neilsen", "89899794", "25445");
	Example e2 = new Example("prudhvi","HGS","5976122489");
	e1.display();
	e2.display();
	
}









	

}
