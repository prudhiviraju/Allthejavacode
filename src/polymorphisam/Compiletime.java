package polymorphisam;




//the method overloading concept is called compiletime polymorphisam

public class Compiletime {

	public void add() {
		System.out.println("");
	}
	
	private void add(int number) {
		System.out.println("");
	}
	
	
	void add(String name) {
		System.out.println("this is the same name that we are addded");
	}
	
	
	protected void add(int num, String name) {
		
		System.out.println("the same method that we added but the thing is we are passing diff parameters");
		
		
	}
}
