import java.text.NumberFormat;

public class FVCalc {
	public static void main(String[] args){
	int currentValue  = (Math.abs(25000));
    	double rate = 12;
    	int nOfYears = 5; 

    System.out.println(
    		currentValue + " " + 
	    	(int) rate  + " " +
    		nOfYears);

    double futureValue = currentValue * 
                        (Math.pow((1 + rate/100), nOfYears));
    
    String annualRate = 
	    NumberFormat.getPercentInstance().format(rate/100); 
    String currentValue$ = 
	    NumberFormat.getCurrencyInstance().format(currentValue);
    String futureValue$ = 
	    NumberFormat.getCurrencyInstance().format(futureValue);
   
    
    System.out.println(
            		"After " + nOfYears + " years, " +
            		currentValue$ + " saved at " + 
           		 annualRate + " will yield " + 
            		 futureValue$);	
	}
}
