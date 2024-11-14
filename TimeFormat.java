// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
        String timeFormat  = (args[0]);

                int i = 0;
                String hours   = ""; 
                String minutes = "";
        
        while ( i < 2) {
                char n = timeFormat.charAt(i);
                hours = hours + n; 

                i++ ;

             }
            i = 3;
        while ( i < 4) {
                char n = timeFormat.charAt(i);
                minutes = minutes + n; 

                i++ ;
             }

                int hoursInt = Integer.parseInt(hours);
                int minutesInt = Integer.parseInt(minutes);

        if (hoursInt == 0) {
                            hoursInt =+ 12;
                            System.out.println(
                            hoursInt + ":" + minutesInt + " AM");


       } else if (hoursInt > 12) {
                            System.out.println(
                            (hoursInt - 12) + ":" + 
                            minutesInt + " PM");

        }
         else if (hoursInt == 12) {
                            System.out.println(
                            hoursInt + ":" +
                            minutesInt + " PM"); 
        }
        else { 
                            System.out.println(
                            hoursInt + ":" +
                            minutesInt + " AM");

        }
         }
}
