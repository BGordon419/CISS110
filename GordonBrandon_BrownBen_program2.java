import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//import java.lang.String;

public class GordonBrandon_BrownBen_program2 // Jed Yeung, Jacob Book, Shreshta Kota
{
     public static void main(String[] args)
     {   
          DecimalFormat formatter = new DecimalFormat("0000");
          
          int number;
          do
          {
               number = getnum();
               
               if(number==0)
               {
                    JOptionPane.showMessageDialog(null,"You have entered an invalid number.");
               }
               else
               {
                    JOptionPane.showMessageDialog(null,formatter.format(encrypt(number)));
               }
          }
          while(number==0);
     }
     
     public static int encrypt(int num)
     {
          int ones, tens, hundreds, thousands, tenThousands, encrypted;
          
          thousands = (num / 1000);
          hundreds = (num / 100 - (thousands * 10)) ;
          tens = (num / 10 - (thousands * 100) - (hundreds * 10));
          ones = (num - (thousands * 1000) - (hundreds * 100) - (tens * 10));
          
          int onesE, tensE, hundredsE, thousandsE, tenThousandsE;
          
          thousandsE = ( thousands + 7) % 10;
          hundredsE = ( hundreds + 7) % 10;
          tensE = ( tens + 7) % 10;
          onesE = ( ones + 7) % 10;
          
          encrypted = tensE * 1000 + onesE * 100 + thousandsE * 10  + hundredsE;
          
          return encrypted;
          
          //JOptionPane.showMessageDialog(null,thousandsE  + "   " + hundredsE  + "   " + tensE + "   " + onesE);
          
     }
     
     public static int getnum()
     {
          String input = JOptionPane.showInputDialog("Input 4 digit number");
          int length = input.length();
          
          if(length==4)
          {
               return Integer.parseInt(input);
          }
          else
               return 0;
          
     }
}