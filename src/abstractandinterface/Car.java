package abstractandinterface;

public interface Car {

	
	//in interface we always define only abstract method	
	//no method body
	//we achieve 100% abstraction
	//only method declaration
	//cannot create the object of interface
	//only final and static vars;
	
	public int wheels =4;
	static int gear=5;
	
	
	public void razz();
	public void start();
	public void stop();
	public void refuel();
	
	
}
