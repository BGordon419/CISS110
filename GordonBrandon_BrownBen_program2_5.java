import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class GordonBrandon_BrownBen_program2_5 // Jed Yeung, Jacob Book, Shreshta Kota
{
     public static void main(String[] args)
     {   
          int number = getnum();
          DecimalFormat formatter = new DecimalFormat("0000");
          
          JOptionPane.showMessageDialog(null,formatter.format(input(number)));
     }
     
     public static int input(int num)
     {
          int ones, tens, hundreds, thousands, tenThousands, unencrypted, temp;
          
          thousands = (num / 1000);
          hundreds = (num / 100 - (thousands * 10)) ;
          tens = (num / 10 - (thousands * 100) - (hundreds * 10));
          ones = (num - (thousands * 1000) - (hundreds * 100) - (tens * 10));
          
          unencrypted = unencrypt(tens) * 1000 + unencrypt(ones) * 100 + unencrypt(thousands) * 10  + unencrypt(hundreds);
          
          return unencrypted;
     }
     
     public static int getnum()
     {   
          String input = JOptionPane.showInputDialog("Input 4 digit number");
          int length = input.length();
          
          while(length!=4)
          {
               input = JOptionPane.showInputDialog(null,"You have entered an invalid number.");
               length = input.length();
          }
          
          return Integer.parseInt(input);
     }
     
     public static int unencrypt(int input)
     {
          switch (input)
          {
               case 7: input = 0; break;
               case 8: input = 1; break;
               case 9: input = 2; break;
               case 0: input = 3; break;
               case 1: input = 4; break;
               case 2: input = 5; break;
               case 3: input = 6; break;
               case 4: input = 7; break;
               case 5: input = 8; break;
               case 6: input = 9; break;
          }
          return input;
     }
}