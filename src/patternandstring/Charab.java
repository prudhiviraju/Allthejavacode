package patternandstring;


public class Charab {
	/**
	 * 
	 * @param args
	 * 
	 * 
	 * 
	 * a
bb
ccc   to get this output we have to take i
dddd
	 *
	 * 
	 * 
	 * a
ab
abc     to get this output we have to print j
abcd
	 * 
	 */

	public static void main(String[] args) {
		
		for(char i='a';i<='d';i++) {
			for(char j='a';j<=i;j++) {
				
				
				System.out.print(j);
			}System.out.println();
		}
		
		
		
	}
	
	
}
