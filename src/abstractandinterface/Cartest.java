package abstractandinterface;

public class Cartest {

	public static void main(String[] args) {
		
		Bmw  b = new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.razz();
		b.engine();
		
		Car c=new Bmw();
		c.start();
		c.stop();
		c.refuel();
		c.razz();
		//we can't acess the engine method over here because that is applicable for only bmw class 
		
	}
	
	
}
