import javax.swing.JOptionPane;

public class Gui {
  public static void main(String[] args) {
    // asks question and opens a text box for input; Stores input in name
    String name = JOptionPane.showInputDialog("Enter your name");
    // Displays message within parenthesis to user in dialog box
    JOptionPane.showMessageDialog(null, "Hello " + name);

    // Example to convert string to integer
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

    // Example to convert string to double
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
  }
}
