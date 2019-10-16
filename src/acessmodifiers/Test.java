package acessmodifiers;

public class Test {
	
	public String pub = "public acess";
	private String pri = "private acess";
	String deefault = "defailt acess";
	protected String pro = "protec acess";
	
	
	public void m1() {
		System.out.println("m1 is the public");
	}
	
	private void m2() {
		System.out.println("m2 is the private");
	}

	
	protected void m3() {
		
		System.out.println("m3 is the protected");
	}
	
	
	void m4() {
		System.out.println("m4 is the default");
	}
	
}

