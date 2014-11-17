import javax.swing.JOptionPane;

public class power
{
     
     public static void main(String[] args)
     {
          // Inputs
          String firstNumber = JOptionPane.showInputDialog("Enter first number.");
          String secondNumber = JOptionPane.showInputDialog("Enter second number.");
          
          // Outputs - sends user input to 'power' Method
          JOptionPane.showMessageDialog(null,power(Double.parseDouble(firstNumber)
                                                        ,Double.parseDouble(secondNumber)));
     }
     
     // recives 2 numbers, outputs first number to the power of the second.
     public static double power(double num1, double num2)
     {
          for(int x=1;x<num2;x++)
          {
               num1=num1*num1;
          }
          return num1;
     }
     
}