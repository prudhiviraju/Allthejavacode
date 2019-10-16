package abstractandinterface;

public abstract class Bank {
	
	
	static int rate =100;
	int amount =100;
	public static int rate1 =10;
	
	//partial abstraction
	//hiding the implementation logic --Abstraction
	
	//cannot create object of abstract classes

	public  abstract void loan();//no mehtod body
	
	public abstract void razz();//abstract method
		
	
	//non abstract method
	public void credit() {  //method body
		
		System.out.println("bank credit");
	}
	
	public void debit() {
		
		System.out.println("bank debit");
	}
	
	
	
}
