package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String > languages = new HashSet<String>();
		
		System.out.println("languages are empty"  + languages.isEmpty());

		
		languages.add("chrome");
		languages.add("firefox");
		languages.add("ie");
		languages.add("edge");
		System.out.println("the level 1" + languages);
		
		languages.add(null);
		languages.add(null);
		System.out.println(" the level 2 adding the null"  + languages);
		
		languages.add("chrome");
		languages.add("edge");
		System.out.println("the level 3 adding the duplicates values" + languages);
		
		languages.remove("firefox");
		System.out.println("removing the firefox");
		
		

		System.out.println(languages.contains("ie"));
		
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println();
		
	}
	
}
