import java.util.ArrayList;

import collections.Arraylist;

public class Genrics<t> {

	
	t ob;
	
	Genrics(t ob){
		 this.ob=ob;
	}
	
	public void show() {
		System.out.println("the type of ob-1" + ob.getClass().getName());
	}
	
	public t getob() {
		
		return ob;
	}

	
	
	public static void main(String[] args) {
		
	
		ArrayList<String > i = new ArrayList<String>();
		
		i.add(0,null);
		i.add("razz");
		
	}
	
	
}
