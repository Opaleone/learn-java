public class Expressions {
  public static void main(String[] args) {
    double friends = 10;

    friends++;
    System.out.println("Increment operator: " + friends);

    // friends = friends + 10;
    // OR
    friends += 10;
    System.out.println("Add: " + friends);

    friends = (double) friends / 3; // convert result to double to display all decimal nums

    System.out.println("Divide with decimals: " + friends);
  }
}
