
public class FVCalc {
	public static void main(String[] args){

	int currentValue = Integer.parseInt(args[0]);	
	currentValue  = (Math.abs(currentValue));
	
	double rate = Double.parseDouble(args[1]);
    int nOfYears = Integer.parseInt(args[2]); 

    double futureValue = currentValue * 
                        (Math.pow((1 + (rate/100)), nOfYears));
    
    String annualRate = 
						(rate/100 + "%"); 
    String currentValue$ = 
	    				"$" + currentValue;
    String futureValue$ = 
						"$" + futureValue;
						
	System.out.println(
            		"After " + nOfYears + " years, " +
            		currentValue$ + " saved at " + 
           		 annualRate + " will yield " + 
            		 futureValue$);	
	}
}
