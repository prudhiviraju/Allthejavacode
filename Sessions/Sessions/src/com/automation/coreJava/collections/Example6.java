package com.automation.coreJava.collections;

/* This example show how to use TreeSet */
import java.util.Iterator;
import java.util.TreeSet;

class Example6 {

	public static void main(String args[]) {

		TreeSet<String> automationTools = new TreeSet<String>();

		System.out.println("IsEmpty:" + automationTools.isEmpty());

		/* How to use add method */
		automationTools.add("QTP");
		automationTools.add("Selenium");
		automationTools.add("Appium");
		automationTools.add("Silk4J");
		System.out.println("Check whether object is added or not :"	+ automationTools.add("RFT"));
		System.out.println("Level 1:" + automationTools);

		/* Try to add duplicate object */
		System.out.println("Check whether object is added or not :"	+ automationTools.add("RFT"));
		System.out.println("Level 2:" + automationTools);

		/* How to use remove method */
		automationTools.remove("QTP");
		System.out.println("Level 3:" + automationTools);

		/* How to use find or search required object */
		System.out.println("Search required Object 'QTP':" + automationTools.contains("QTP"));
		System.out.println("Search required Object 'Selenium':" + automationTools.contains("Selenium"));

		/*Retrieve all objects from  TreeSet using iterator*/
		Iterator<String> iterator = automationTools.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  TreeSet using forEach*/
		for (String language : automationTools) {
			System.out.print(language + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from TreeSet using descendingIterator*/
		Iterator<String> str = automationTools.descendingIterator();
		while(str.hasNext()){
			System.out.print(str.next() + "\t");
		}
		
	}
}
