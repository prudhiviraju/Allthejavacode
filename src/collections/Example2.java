package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example2 {
	
	public static void main(String[] args) {
	
		
		LinkedList<String> languages = new LinkedList<String>();
		
		//adding the languages to the linked list
		
		languages.add("chrome");
		languages.add("firefox");
		languages.add("chrome");                  //here we are adding the objects 
		languages.add("ie");
		System.out.println("the level 1"+languages);
		
		//adding the object through index
		
		languages.add(0,"opera");  //here we are adding the objects through the help of index  even zero we mentioned also add.first()
		//will come first
		languages.add(5,"chrome");
		languages.addFirst("safari");//it'll come first always
		
		System.out.println("level 2"+languages);

		
		//adding the null
		languages.add(null);       //here we are adding the null so linked list is accept the null as well
		System.out.println("level 3"+languages);
		
		//calling object
		System.out.println("the level 4"+languages.get(0));
		
		
		//removing the objects
		languages.remove(0);
		languages.remove("ie");
		
		//how to update object
		languages.set(5,"bing");
		System.out.println("the level 5"+languages);

		
		//finding the object
		System.out.println("the language contains"+languages.contains("bing"));
		System.out.println("the language contain"+languages.contains("firefox"));
		
		
		
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  LinkedList  using ListIterator*/
		ListIterator<String> listIterator = languages.listIterator();
		
		System.out.println("Forward Direction");
		
		while(listIterator.hasNext()){
			System.out.print(listIterator.next() + "\t");
		}
		
		System.out.println();
		System.out.println("Backward Direction");
		
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous() + "\t");
		}
		
		/*clear all objects from LinkedList */
		languages.clear();
		System.out.println();
		System.out.println("Size:" + languages.size());
		System.out.println(languages);
		
		languages.removeAll(languages);
		System.out.println("Size:" + languages.size());
		System.out.println(languages);

		
		
		
		
		
		
		
		
		
		
		
	}
	

}
