package Collectionspractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;



public class Arraylist {


	
	public static void main(String[] args) {
		
		
		ArrayList<String> name  = new ArrayList<String>();
		
		System.out.println("the list is empty");
		
		
		name.add("pushparaj");
		name.add("alesamma");
		name.add("avinash");
		name.add("chandu");
		
		
		System.out.println("added the langauges"+ name);

		
		name.add(0,"yeddula");
		name.add(1,"family");
		name.add(2,"delete");
		
		System.out.println("added the data using the index" + name);
		
		
		System.out.println("and now update the object");
		name.set(2,"kings" );
		
		System.out.println(name+" set the object");
		
		System.out.println("searching the object " + name.contains("yeddula"));
		
		System.out.println("retrieve the data from arraylist ussing iterator");
		
		
		
		java.util.Iterator<String> iterator =  name.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  ArrayList  using ListIterator*/
		ListIterator<String> listIterator = name.listIterator();
		
		System.out.println("Forward Direction");
		
		while(listIterator.hasNext()){
			System.out.print(listIterator.next() + "\t");
		}
		System.out.println("Backward Direction");
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous() + "\t");
		}	
		
		System.out.println("now adding the duplicates");
		
		
	
		name.add("chandu");
		
		
		System.out.println(name);
		
	}

	
	
	
}
