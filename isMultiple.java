import javax.swing.JOptionPane;

public class isMultiple
{
     
     public static void main(String[] args)
     {
          // Inputs
          String firstNumber = JOptionPane.showInputDialog("Enter first number.");
          String secondNumber = JOptionPane.showInputDialog("Enter second number.");
          
          // Outputs - sends user input to 'power' Method
          JOptionPane.showMessageDialog(null,isMultiple(Double.parseDouble(firstNumber)
                                                             ,Double.parseDouble(secondNumber)));
     }
     
     // recives 2 numbers, outputs first number to the power of the second.
     public static String isMultiple(double num1, double num2)
     {
          double smaller, larger;
          
          if(num1<num2)
          {
               smaller = num1;
               larger = num2;
          }
          else if(num2<num1)
          {
               larger = num1;
               smaller = num2;
          }
          else
          {
               larger = 2;
               smaller = 1;
          }
          
          if(larger%smaller==0)
               return "True";
          else
               return "False";
     }
     
}