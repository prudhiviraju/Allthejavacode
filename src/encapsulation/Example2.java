package encapsulation;

public class Example2 {

	public static void main(String[] args) {
		
		
		Example e1 = new Example();
		e1.setempid(25445);
		e1.setename("prudhvi");
		e1.setecomp("neilsen");
		e1.displayinfo();
		
		System.out.println("============================"  );
		System.out.print("\n");
		
		
		
		Example e2 = new Example();
		e2.setename("R@zz");
		e2.setecomp("HGS");
		e2.setempid(9440077);
		e2.displayinfo();
		
		
		
		
		
	}
	
}
