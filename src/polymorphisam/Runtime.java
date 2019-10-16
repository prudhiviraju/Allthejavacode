package polymorphisam;

/**
 * 
 * @author Prudhvi R@zz
 * This Runtime polymorphisam is only for public,protected and default methods not for the private methods 
 * runtime r = new child();
 * 
 *
 */


public class Runtime {
	
	public void m1() {
		System.out.println("this os the public method ");
	}
	
	void m2() {
		System.out.println("this is the default method");
	}
	
	protected void m3() {
		System.out.println("this is the protected method ");
	}
	
	private void m4() {
		System.out.println("this is the private method");
	}

	
	
	
}


 class Child extends Runtime{
	
	public void m5() {
		System.out.println("this is the childclass");
	}
	
	protected void m3() {
		System.out.println("this is same as be the parent class ");
	}
	
	private void m4() {
		System.out.println("same as the parent");
	}
	

}

 
 class Example{
	 
	 
	 
	 public static void main(String[] args) {
		Runtime r = new Runtime();
		
		r.m1();
		r.m2();
		r.m3();
		
		
		Child c = new Child();
		c.m1();
		c.m3();
		c.m2();
		c.m5();
		
		
		

		Runtime ra = new Child();
	
		ra.m1();
		ra.m2();
		ra.m3();
	
		
	}
	 
	 
	 
	 
	 
	 
	 
	 
 }



