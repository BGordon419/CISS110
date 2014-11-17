import javax.swing.JOptionPane;

public class larger
{
     
     public static void main(String[] args)
     {
          // Inputs
          String firstNumber = JOptionPane.showInputDialog("Enter first number.");
          String secondNumber = JOptionPane.showInputDialog("Enter second number.");
          
          // Outputs - sends user input to 'power' Method
          JOptionPane.showMessageDialog(null,larger(Double.parseDouble(firstNumber)
                                                         ,Double.parseDouble(secondNumber)));
     }
     
     // recives 2 numbers, outputs first number to the power of the second.
     public static double larger(double num1, double num2)
     {
          if(num1<num2)
               return num2;
          else
               return num1;
     }
     
}