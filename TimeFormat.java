// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	

        int hourInput = Integer.parseInt(args[0]);
        int minuteInput = Integer.parseInt(args[1]);

        if (hourInput < 10)  { 
            String addZeroHour = "0" + hourInput; 
            System.out.print(addZeroHour + ":"); 

        } else { System.out.print(hourInput + ":");
        }
     
        if ( minuteInput < 10)  {
            String addZeroMinute = "0" + minuteInput;
            System.out.print(addZeroMinute); 

        } else { System.out.print(minuteInput); 
        
        	System.out.println();

        }
        if (hourInput > 12) {
            System.out.println((hourInput - 12) + 
            ":" + minuteInput);

        } else { System.out.println(hourInput + 
        ":" + minuteInput); 
        }

    }
}
