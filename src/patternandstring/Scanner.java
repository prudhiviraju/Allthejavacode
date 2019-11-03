package patternandstring;

public class Scanner {

	public static void main(String[] args) {
		
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		
		System.out.println("Enter the no.of rows need to print");
		int row=scanner.nextInt();
		
		System.out.println("printing the pattern");
		
		for(int i=0;i<=row;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	
}
