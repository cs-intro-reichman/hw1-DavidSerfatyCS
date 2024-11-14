public class Bill3 {
    public static void main(String[] args) {
  
    String name1 = args[0];
    String name2 = args[1];
    String name3 = args[2];

    double value = Double.parseDouble(args[3]); 
    int nOfDiners = 3;
    double bill3 = (value/nOfDiners);
    bill3 = Math.ceil(bill3);

    System.out.println( 
        "Dear " +
        name1   + ", "     + 
        name2   + ", and " + 
        name3   + ": pay " +
        bill3   + 
        "Shekels each." );


    }
}