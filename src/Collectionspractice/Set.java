package Collectionspractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

import collections.Hashset;

public class Set {

	
	public static void main(String[] args) {
		
		
	
		HashSet<String> name = new HashSet<String>();
		
		
		System.out.println("the list is empty");
		
		
		name.add("pushparaj");
		name.add("alesamma");
		name.add("avinash");
		name.add("chandu");
		
		
		System.out.println("added the langauges"+ name);

		
		name.add("yeddula");
		name.add("family");
		name.add("delete");
		
		System.out.println("added the data using the index" + name);
		
		
		
		System.out.println("searching the object " + name.contains("yeddula"));
		
		System.out.println("retrieve the data from arraylist ussing iterator");
		
		
		
		java.util.Iterator<String> iterator =  name.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		
		
		System.out.println("now adding the duplicates");
		
		
	
		name.add("chandu");
		
		
		System.out.println(name);
		
		
		
		
	}
	
}
