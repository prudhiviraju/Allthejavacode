package abstractandinterface;

public class Bmw implements Car{

	@Override
	public void razz() {
		System.out.println("Razz");
		
	}

	@Override
	public void start() {
		System.out.println("the bmw start");
		
	}

	@Override
	public void stop() {
		System.out.println("the bmw stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("the bmw refuel");
		
	}
	
	
	public void engine() {
		System.out.println("the engine of bmw");
	}

}
