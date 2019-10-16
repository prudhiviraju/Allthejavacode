package classandobjects;

public class Example {

	public static  int empid;
	public String empname;
	public String compname;
	
	
	
	public void displaydetails() {
		
		System.out.println("the empid is" + empid + "/t");
		System.out.println("the empname is" + empname + "/t" );
		System.out.println("the compname is " + compname+ "/t");
		
		
	}
	
public static void main(String[] args) {
	
	Example e1 = new Example();
	empid =1111;        // if it is static object not required to create an object
	                   //and we can call them directly because static means it will have only one
	e1.empname="R@zz";
	e1.compname="neilsen";
	e1.displaydetails();
	
	Example e2 = new Example();
	empid=2222;
	e2.empname="prudhivi";
	e2.compname="HGS";
	e2.displaydetails();

	
	
	
	
	
}
	
	
	
	
}
