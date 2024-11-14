// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	

        String hourInput = (args[0]);
        String minuteInput = (args[1]);

        int hourInputInt = Integer.parseInt(hourInput);
        int minuteInputInt = Integer.parseInt(minuteInput);


        if (hourInputInt < 10)  { 
            String addZeroHour = "0" + hourInput; 
            System.out.print(addZeroHour + ":"); 

        } else { System.out.print(hourInput + ":");
        }
     
        if ( minuteInputInt < 10)  {
            String addZeroMinute = "0" + minuteInput;
            System.out.print(addZeroMinute); 

        } else { System.out.print(minuteInput); 
        
        	System.out.println();

        }
        if (hourInputInt > 12) {
            System.out.println((hourInputInt - 12) + 
            ":" + minuteInput);

        } else { System.out.println(hourInput + 
        ":" + minuteInput); 
        }

    }
}
