package com.automation.coreJava.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;

/* This example shows how to use Vector */
class Example3 {

	public static void main(String args[]) {

		/*Create Vector object */
		Vector<String> languages = new Vector<String>();
		
		System.out.println("isEmpty:" + languages.isEmpty());
		
		/* How to add objects to Vector */
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("JAVA");
		languages.add(".NET");
		languages.add("C#");
		
		System.out.println("Level 1:" +languages);
		
		/* Add null  object to Vector */
		languages.add(null);
		System.out.println("Level 2:" +languages);
		
		/*Add objects to Vector based on index */
		languages.add(0, "COBOL");
		System.out.println("Level 3:" + languages);
		System.out.println("Size:" + languages.size());
		
		/* How to get object from Vector */
		System.out.println("Level 4:" + languages.get(0));
		
		/* Remove object from Vector */
		languages.remove("COBOL");
		languages.remove(0);
		System.out.println("Level 5:" + languages);
		
		/* How to update object */
		languages.set(0, "C++");
		System.out.println("Level 5:" + languages);
		
		/* How to use find or search required object */
		System.out.println("Find required object 'C++':" + languages.contains("C++"));
		System.out.println("Find required object 'C++':" + languages.contains("SELENIUM"));
		
		/*Retrieve all objects from  Vector  using iterator*/
		System.out.println("Using Enumerator:");
		Enumeration<String> enumerator =  languages.elements();
		while(enumerator.hasMoreElements()){
			System.out.print(enumerator.nextElement() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  Vector  using iterator*/
		System.out.println("Using Iterator:");
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  Vector  using ListIterator*/
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
		
		/*clear all objects from Vector */
		languages.clear();
		System.out.println();
		System.out.println("Size:" + languages.size());
		System.out.println(languages);
		
		languages.removeAll(languages);
		System.out.println("Size:" + languages.size());
		System.out.println(languages);
	}
}
