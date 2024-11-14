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
        while ( i < 5) {
                char n = timeFormat.charAt(i);
                minutes = minutes + n; 

                i++ ;
             }

                int hoursInt = Integer.parseInt(hours);
               

        if (hoursInt == 0) {
                            
                            System.out.println(
                            "0" + hoursInt + ":" + minutes + " AM");


       } else if (hoursInt > 12) {
                            System.out.println(
                            (hoursInt - 12) + ":" + 
                            minutes + " PM");

        }
         else if (hoursInt == 12) {
                            System.out.println(
                            hoursInt + ":" +
                            minutes + " PM"); 
        }
        else { 
                            System.out.println(
                            hoursInt + ":" +
                            minutes + " AM");

        }
         }
}
