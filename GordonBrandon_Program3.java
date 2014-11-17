import javax.swing.JOptionPane;

public class GordonBrandon_Program3 // Jed Yeung, Jacob Book, Shreshta Kota, Ben Brown
{
     public static void main(String[] args)
     {
          String str = JOptionPane.showInputDialog("Input a string");
          
          JOptionPane.showMessageDialog(null,"Input = " + str + "\n" + "Output = " + reverseIt(str));
     }
     
     public static String reverseIt(String myString)
     {
          int x, length = myString.length() - 1, reversedLength;
          String reversed = "";
          
          for(x=0;x<=length;x++)
          {
               reversedLength = length - x;
               reversed = reversed + myString.charAt(reversedLength);
          }
          return reversed;
     }
}