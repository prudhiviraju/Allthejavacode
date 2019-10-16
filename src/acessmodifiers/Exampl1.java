package acessmodifiers;

public class Exampl1 {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.m1();      //m1 is the public
		t1.m3();      //m3 is the protected
		t1.m4();      //m4 is the default
	
		
		
		
		
		
		

		
		System.out.println(t1.deefault);  //defailt acess
		System.out.println(t1.pro);    //protec acess
		System.out.println(t1.pub);   //public acess
		
	}
	
	
}
