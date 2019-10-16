package priniting;

public class Example3 {
	
	
	 public static void main(String args[])
	    {
	        int i, j, k=8;
	        for(i=0; i<5; i++)
	        {
	            for(j=0; j<k; j++)
	            {
	                System.out.print(" ");
	            }
	            k = k - 2;
	            for(j=0; j<=i; j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }	
}
