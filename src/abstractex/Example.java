package abstractex;

abstract class Example {

	
	public Example() {
		
		System.out.println("this is the constructor");
	}
	
	public void m1() {
		System.out.println("this is the public we can acess anywhere");
		
	}
	
	protected void m2() {
		System.out.println("this is protected  so we can acess this in another package also but using extends keyword");
		
	}
	
	void m3() {
		System.out.println("this is the default with in package");
	}
	
	private void m4() {
		
		
		System.out.println("this is private only for class level");
	}
}


class test2 extends Example{
	
	public static void main(String[] args) {
		
		test2 t2 = new test2();
		t2.m1();
		t2.m2();
		t2.m3();
		
		// in this we can't acess the private only for a particular class only it will be
		
		
	}
	
	
	
	
}

class test3 extends Example{
	
	public void test() {
		
		test3 t3 = new test3();
		t3.m1();
		t3.m2();
		t3.m3();                        //this is also same as above exapmle
		
		
	}
	
	
	
}















