/*net revenue of 4.6 million
 * East Cost Division makes up 62% of the revenue
 * calculate the East Coast sales in terms of dollars
 */

import javax.swing.JOptionPane;

public class revenue
{
     public static void main (String[] args)
     {
          // Using string as temp storage before parse
          String revStr;
          String percStr;
          // Declaring Variables
          Float revNum;
          Byte percNum;
          
          // Asks user for revenue
          revStr = JOptionPane.showInputDialog("Enter net revenue.");
          revNum = Float.parseFloat(revStr); // parses string to Float
          
          // Asks user for percent of revenue
          percStr = JOptionPane.showInputDialog("Enter Percentage of Sales.\nEntered number must be <127%.");
          percNum = Byte.parseByte(percStr); // parses string to byte
          
          // Calculates East Coast revenue
          float eastCoastRevenue = (revNum * percNum / 100);
          
          //Output
          JOptionPane.showMessageDialog(null, "The East Coast revenue is $" + eastCoastRevenue);
     }
}