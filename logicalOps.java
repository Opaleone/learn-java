import java.util.Scanner;

public class logicalOps {
  public static void main(String[] args) {
    /*
     * Works like JavaScript
     * 
     * && - (AND) both conditions must be true
     * || - (OR) either condition must be true
     * ! - (NOT) reverses boolean value of condition
     * 
     */


    // &&

    int temp = 25;

    if (temp > 30) {
    System.out.println("It is hot outside!");
    } else if (temp >= 20 && temp <= 30) {
    System.out.println("It is warm outside");
    } else {
    System.out.println("It is cold AF!");
    }

    // ||

    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit");
    String response = scanner.next();

    if (response.equals("q") || response.equals("Q")) {
      System.out.println("You quit. Loser.");
    } else {
      System.out.println("If you say so......");
    }
    scanner.close();
  }
}
