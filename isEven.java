import javax.swing.JOptionPane;

public class isEven
{
     
     public static void main(String[] args)
     {
          // Inputs
          String number = JOptionPane.showInputDialog("Enter a number.");
          
          // Outputs - sends user input to 'isEven' Method
          JOptionPane.showMessageDialog(null,isEven(Integer.parseInt(number)));
     }
     
     // recives 2 numbers, outputs 'True' if even, 'False' if odd.
     public static String isEven(int num)
     {
          if(num%2==0)
               return "True";
          else
               return "False";
          
     }
     
}