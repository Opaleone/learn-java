public class ifStatements {
  public static void main(String[] args) {

    /* Various comparison operators:
     * 
     * ==
     * !=
     * >
     * <
     * >=
     * <=
     * 
     */
    
    int age = 18;

    if (age >= 75) {
      System.out.println("Okay boomer.");
    } else if (age >= 18) {
      System.out.println("You\'re good to go!");
    } else {
      System.out.println("Not allowed entry!");
    }
  }
}
