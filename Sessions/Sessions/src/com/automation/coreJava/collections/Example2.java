package com.automation.coreJava.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* This example shows how to use LinkedList */
class Example2 {

	public static void main(String args[]) {

		/*Create LinkedList object */
		LinkedList<String> languages = new LinkedList<String>();
		
		System.out.println("isEmpty:" + languages.isEmpty());
		
		/* How to add objects to LinkedList */
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("JAVA");
		languages.add(".NET");
		languages.add("C#");
		
		System.out.println("Level 1:" +languages);
		
		/* Add null  object to LinkedList */
		languages.add(null);
		System.out.println("Level 2:" +languages);
		
		/*Add objects to LinkedList based on index */
		languages.add(0, "COBOL");
		languages.addFirst("PASCAL");
		languages.addFirst("PHP");
		System.out.println("Level 3:" + languages);
		System.out.println("Size:" + languages.size());
		
		/* How to get object from LinkedList */
		System.out.println("Level 4:" + languages.get(0));
		
		/* Remove object from LinkedList */
		languages.remove("COBOL");
		languages.remove(0);
		System.out.println("Level 5:" + languages);
		
		/* How to update object */
		languages.set(0, "C++");
		System.out.println("Level 5:" + languages);
		
		/* How to use find or search required object */
		System.out.println("Find required object 'C++':" + languages.contains("C++"));
		System.out.println("Find required object 'C++':" + languages.contains("SELENIUM"));
		
		/*Retrieve all objects from  LinkedList  using iterator*/
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
