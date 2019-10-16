ispackage com.automation.coreJava.collections;

/* This example show how to use HashSet */
import java.util.HashSet;
import java.util.Iterator;

class Example5 {

	public static void main(String args[]) {

		HashSet<String> automationTools = new HashSet<String>();

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
		automationTools.add(null);
		automationTools.add(null);
		System.out.println("Level 2:" + automationTools);

		/* How to use remove method */
		automationTools.remove("QTP");
		System.out.println("Level 3:" + automationTools);

		/* How to use find or search required object */
		System.out.println("Search required Object 'QTP':" + automationTools.contains("QTP"));
		System.out.println("Search required Object 'Selenium':" + automationTools.contains("Selenium"));

		/*Retrieve all objects from  HashSet  using iterator*/
		Iterator<String> iterator = automationTools.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  HashSet  using forEach*/
		for (String language : automationTools) {
			System.out.print(language + "\t");
		}
		
	}
}
