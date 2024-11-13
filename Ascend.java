// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Arrays;
public class Ascend {
	public static void main(String[] args) {
		
	    int nOfIntegers = 3;
    	int[] ascending = new int[nOfIntegers];
        int lim = Integer.parseInt(args[0]);

    for (int i = 0; i < nOfIntegers; i++) {

        int max = lim;
        int min = 0;
        int randomThree =  (int) (Math.random() * ((max - min) + 1));
        ascending[i] = randomThree;
     }

    for (int i = 0; i < nOfIntegers; i++) {
          System.out.print(ascending[i] + " "); 
        }

       System.out.println("");
    
       Arrays.sort(ascending);
       for (int i = 0; i < nOfIntegers; i++) {
           System.out.print(ascending[i] +  " ");
        }	
	}
}
