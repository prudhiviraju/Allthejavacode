package com.automation.coreJava.collections;

/* This example show how to use HashMap */
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Example10 {

	public static void main(String args[]) {

		HashMap<String, String> hashMap = new HashMap<String, String>();

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
		hashMap.put(null, "KIRAN");
		System.out.println("Level 3:" + hashMap);
		
		/* add null as value  */
		hashMap.put("Name", null);
		System.out.println("Level 4:" + hashMap);
		
		/* add null as key and value value  */
		hashMap.put(null, null);
		System.out.println("Level 5:" + hashMap);
		
		/* remove null key from HashMap */
		hashMap.remove(null);
		System.out.println("Level 6:" + hashMap);
		
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
