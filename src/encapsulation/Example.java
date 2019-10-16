package encapsulation;

public class Example {

	private String Ename;
	private String Ecomp;
	private int Empid;
	
	
	
	public void setempid(int empid) {
		
		if(empid<=0) {
			System.out.println("the empid cannot be lessthan zero");
			System.exit(0);
		}else {
			this.Empid=empid;
			System.out.println("that's a valid id");
		}
		
	}
	
	
	
	public void setename(String ename) {
		
		if((ename==null)|(ename).equals("")) {
			
			System.out.println("ename cannot be nuul or empty");
			System.exit(0);
		}else {
			
			this.Ename=ename;
			
		}
		
	}
	
	
	public void setecomp(String ecomp) {
		
		if((ecomp==null)|(ecomp).equals("")) {
			
			System.out.println("ecomp cannot be null or empty");
		}else {
			
			this.Ecomp=ecomp;
		}
			
	}
	
	
	
	public void displayinfo() {
		
		
		System.out.println("the emp id is"+Empid+"/t");
		System.out.println("the ename is"+Ename+ "/t");
		System.out.println("the ecompis"+Ecomp+"/t");
	}
	
	
	
	
}
