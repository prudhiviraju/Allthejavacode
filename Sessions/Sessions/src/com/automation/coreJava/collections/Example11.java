package com.automation.coreJava.collections;

/* This example show how to use Hashtable */
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Example11 {

	public static void main(String args[]) {

		Hashtable<String, String> hashMap = new Hashtable<String, String>();

		System.out.println("IsEmpty:" + hashMap.isEmpty());

		/* add objects to map */
		hashMap.put("TesctScript", "TC001");
		hashMap.put("FirstName", "RAMKI");
		hashMap.put("LastName", "TIGER");
		System.out.println("Level 1:" + hashMap);

		/* add duplicate key  */
		hashMap.put("FirstName", "SCOTT");
		System.out.println("Level 2:" + hashMap);
		
		/* add null as key  */
		/*uncomment below line will get Error message */
		//hashMap.put(null, "KIRAN");
		System.out.println("Level 3:" + hashMap);
		
		/* add null as value  */
		/*uncomment below line will get Error message */
		//hashMap.put("Name", null);
		System.out.println("Level 4:" + hashMap);
		
		/* add null as key and value value  */
		/*uncomment below line will get Error message */
		//hashMap.put(null, null);
		System.out.println("Level 5:" + hashMap);
		
		/* get value from hashmap based on key */
		System.out.println("FirstName:" + hashMap.get("FirstName"));
		System.out.println("LastName:" + hashMap.get("LastName"));

		/* Retrieve all keys from HashMap object */
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, String> entry = entryIterator.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		/* Retrieve keySet from HashMap object */
		System.out.println("Retrieve All keys:");
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		
		/* Retrieve values from HashMap object */
		System.out.println("Retrieve All Values:");
		Collection<String> valueSet = hashMap.values();
		Iterator<String> itertor = valueSet.iterator();
		while (itertor.hasNext()) {
			System.out.print(itertor.next() + "\t");
		}
		System.out.println();
	}
}
