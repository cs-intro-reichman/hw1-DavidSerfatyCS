// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	int maxHour = 23;
        int minHour = 0;

        int randomHourInput =  (int) (Math.random() *
                             ((maxHour - minHour) + 1));

        if (randomHourInput < 10)  {
            String randomHourString = "" + randomHourInput;
            String addZeroHour = "0" + randomHourString; 
            System.out.print(addZeroHour + ":"); 

        } else { System.out.print(randomHourInput + ":");
        }
     
        int randomMinuteInput = randomMinuteGenerator();
        if ( randomMinuteInput < 10)  {
            String randomMinuteString = "" + randomMinuteInput;
            String addZeroMinute = "0" + randomMinuteString; 
            System.out.print(addZeroMinute); 

        } else { System.out.print(randomMinuteInput); 
        
        	System.out.println("");

        }
        if (randomHourInput > 12) {
            System.out.println((randomHourInput - 12) + 
            ":" + randomMinuteInput);

        } else { System.out.println(randomHourInput + 
        ":" + randomMinuteInput); 
        }
}
public static int randomMinuteGenerator () {
        int maxMinute = 59;
        int minMinute = 0;
        
        int randomMinuteInput =  (int) (Math.random() * 
                            ((maxMinute - minMinute) + 1));
        return randomMinuteInput;	
	}
}
