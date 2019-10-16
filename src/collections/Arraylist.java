package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> languages = new ArrayList<String>();
		System.out.println("is empty" + languages.isEmpty());
		
		//adding the languages
		
		languages.add("java");
		languages.add("c");
		languages.add("c++");
		languages.add("python");
		
		System.out.println("level 1"+languages);
		
		//adding null
		
		languages.add(null);  // in the arraylist we are able to add the null
		System.out.println(languages +"level 2");
		
		//adding objects to arraylist based on index
		languages.add(0,"prudhvi razz");
		languages.add(1,"razzz");
		System.out.println("level3"+languages);
		
		//remove object from arraylisst
		languages.remove("java");
		languages.remove(0);
		
		//update object 
		languages.add(0,"prem");
		System.out.println("level 4"+languages);
		
		//search the object
		System.out.println("the name contains"+languages.contains("razzz"));
		System.out.println("the name contains"+languages.contains("prem"));
		
		
		
		//retrive all objects from arraylist using iterator
		
ListIterator<String> listIterator = languages.listIterator();
		
		System.out.println("Forward Direction");
		
		while(listIterator.hasNext()){
			System.out.print(listIterator.next() + "\t");
		}
		System.out.println("Backward Direction");
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous() + "\t");
		}
		
		/*clear all objects from ArrayList */
		languages.clear();
		System.out.println("Size:" + languages.size());
		System.out.println(languages);
		
		languages.removeAll(languages);
		System.out.println("Size:" + languages.size());
		System.out.println(languages);

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		languages.clear();
		
		
		
		
		
		
		
		
		
	}
	
	

}
