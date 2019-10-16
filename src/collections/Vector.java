package collections;

import java.util.Iterator;

import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

public class Vector {

	public static void main(String[] args) {
		java.util.Vector<String> languages = new java.util.Vector<String>();
		languages.add("chrome");
		languages.add("firefox");
		languages.add("opera");
		languages.add("bing");
		
		System.out.println("the level 1"+languages);
		
		// adding the null the level 2
		
		languages.add(null);
		languages.add(null);
		System.out.println("the level 2 adding null "  +languages);
		
		
		// level 3 adding the object by using the index
		
		languages.add(0,"ie");
		System.out.println("the level 3 adding the values through index "+languages);
		
		
		//getting the values 
		System.out.println("the level 4 list "+languages.get(0));
		
		//removing the objects from the vectorlist we can delete them through the index and through the string also
		
		languages.remove("chrome");
		languages.remove(0);
		
		// update the object
		
		languages.set(0,"safari");
		System.out.println("the level 5 updating the object"+languages);
		
		//retrive the vector list by using listiterator
	java.util.ListIterator<String> listIterator = languages.listIterator();
		
		System.out.println("Forward Direction");
		
		while(listIterator.hasNext()){  //reading the data from front
			System.out.print(listIterator.next() + "\t");
		}
		
		System.out.println();
		System.out.println("Backward Direction");
		
		while(listIterator.hasPrevious()){//reading the data from backward
			System.out.print(listIterator.previous() + "\t");
		}
		
		
		
		//clearing the all objects
		
		languages.clear();
		System.out.println("the languages are "+languages);
		System.out.println(languages.size());
		
		
		languages.removeAll(languages);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
