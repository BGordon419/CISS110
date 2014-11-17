import javax.swing.JOptionPane;

public class InputBoxProblem
{
     public static void main(String[] args)
     {
          String name;   // To hold the user's name
          
          name = JOptionPane.showInputDialog("Enter your name.");
          
          // Display the information back to the user.
          JOptionPane.showMessageDialog(null, "Hello, " + name + ".");
          
     }
}