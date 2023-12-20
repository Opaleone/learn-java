import java.util.Scanner;

public class MathExamples {
  public static void main(String[] args) {
    // A lot of these are very similar to JavaScript Math class

    // double x = 3.14;
    // double y = -10;

    // double z = Math.max(x, y);
    // double l = Math.floor(3.14);

    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side x: ");
    x = scanner.nextDouble();
    System.out.println("Enter side y: ");
    y = scanner.nextDouble();

    // calculate triangle hypotenuse;
    z = Math.sqrt((x * x) + (y * y));


    System.out.println("Hypotenuse: " + z);
    scanner.close();
  }
}
