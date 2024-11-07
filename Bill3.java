// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	String nameRon = "Ron";
   	String nameLisa = "Lisa";
    	String nameDan = "Dan";

    	double value = 100; 
	int nOfDiners = 3;

    System.out.println(
        nameRon  + " " + 
        nameLisa + " " + 
        nameDan  + " " +
        (int)value);

    double bill3 = Math.ceil(value/nOfDiners);

    System.out.println(
    		"Each one should pay: " +
     		bill3 + " Shekels. ");

	}
}
