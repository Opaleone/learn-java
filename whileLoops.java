import java.util.Scanner;

public class whileLoops {
  public static void main(String[] args) {
    
    // UNCOMMENT WITH CAUTION
    // ENDLESS LOOP AHEAD
    // while (true) {
    //   System.out.println("HELP!!!");
    // }

    // Creating a program that keeps asking for input while input previously entered is incorrect

    Scanner scanner = new Scanner(System.in);
    String name = "";

    while(name.isBlank()) {
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }

    System.out.println("Hello " + name);
    scanner.close();
  }
}
