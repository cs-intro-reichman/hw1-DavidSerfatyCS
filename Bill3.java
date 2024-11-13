public class Bill3 {
    public static void main(String[] args) {
  
    String name1 = args[0];
    String name2 = args[1];
    String name3 = args[2];
    int value = Integer.parseInt(args[3]); 

    int nOfDiners = 3;

    System.out.println(
        name1  + " " + 
        name2  + " " + 
        name3  + " " +
        value);

    double bill3 = Math.ceil(value/nOfDiners);

    System.out.println(
    "Each one should pay: " +
     bill3 + " Shekels. ");


    }
}