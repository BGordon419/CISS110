import javax.swing.JOptionPane;
//import java.lang.String;

public class GordonBrandon_BrownBen_program1 // Jed Yeung, Jacob Book, Shreshta Kota
{
     public static void main(String[] args)
     {   
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
                    separate_number(number);
               }
          }
          while(number==0);
     }
     
     public static void separate_number(int num)
     {
          int ones, tens, hundreds, thousands, tenThousands;
          
          tenThousands= num / 10000;
          thousands = num / 1000 - (tenThousands * 10) ;
          hundreds = num / 100 - (tenThousands * 100) - (thousands * 10);
          tens = num / 10 - (tenThousands * 1000) - (thousands * 100) - (hundreds * 10);
          ones = num - (tenThousands * 10000) - (thousands * 1000) - (hundreds * 100) - (tens * 10);
          
          JOptionPane.showMessageDialog(null,tenThousands + "   " + thousands  + "   " + hundreds  + "   " + tens + "   " + ones);
     }
     
     public static int getnum()
     {
          String input = JOptionPane.showInputDialog("Input 5 digit number");
          int length = input.length();
          
          if(length==5)
          {
               return Integer.parseInt(input);
          }
          else
               return 0;
     }
}