/*Jed Yeung
 * Shreshta Kota
 * Brandon Gordon 
 */

import javax.swing.JOptionPane;

public class groupProject
{
     public static void main(String[] args)
     {
          
          // Declare variables
          double num1, num2, choice, result = 0;
          
          // User input for 1st and 2nd number
          num1 = Double.parseDouble(JOptionPane.showInputDialog("Input first number."));
          num2 = Double.parseDouble(JOptionPane.showInputDialog("Input second number."));
          
          //User chooses operator
          choice = Double.parseDouble(JOptionPane.showInputDialog("Choose 1 for +.\n Choose 2 for -.\n" + 
                                                                  "Choose 3 for *.\n Choose 4 for /.\nChoose 5 for %."));
          
          // Choosing operator
          if(choice == 1)
          {
               result = num1 + num2; // Addition
          }
          
          else if(choice == 2)
          {
               result = num1 - num2; // Subtraction
          }
          
          else if(choice == 3)
          {
               result = num1 * num2; // Multiplication
          }
          
          else if(choice == 4)
          {
               result = num1 / num2; // Division
          }
          
          else if(choice == 5)
          {
               result = num1 % num2; // Modulus
          }
          
          else
          {
               JOptionPane.showMessageDialog(null," You have entered an invalid option."); // Invalid
               System.exit(0);
          }
          
          // Displays result
          JOptionPane.showMessageDialog(null,"Your answer is: " + result);
          
          System.exit(0);
     }
}