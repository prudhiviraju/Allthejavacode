package javajsp;

import org.apache.poi.ss.formula.functions.Count;

public class Num4 {

	public static int count=1;
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count);
				count++;
			}System.out.println();
		}
		
	}
	
	
}
