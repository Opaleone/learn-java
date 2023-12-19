import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    // initializing new scanner for scanning console input
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name = scanner.nextLine(); // grabs next line in console and stores within name variable

    System.out.println("How old are you? ");
    int age = scanner.nextInt();
    scanner.nextLine(); // this is here to clear console of new line characters in preparation for next scanner command
    
    System.out.println("What is your favorite food?");
    String food = scanner.nextLine();

    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("You like " + food);
  }
}
