// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int integer = 3576; 
    	int hundreds = (integer / 100) ; 
    	int tens = ((integer % 100) / 10 );
    	int ones = ((integer % 10) );

	System.out.println(
   			hundreds + " hundreds, " +
    			tens + " tens, " +  
    			ones + " ones. ");
	}
}
