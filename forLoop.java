import javax.swing.JOptionPane;
import java.io.*;

public class forLoop
{
     public static void main(String[] args) throws IOException
     {
          double z = 0;
          String big = "";
          int x, y = Integer.parseInt(JOptionPane.showInputDialog("Stop where?."));
          
          PrintWriter outputFile = new PrintWriter("big.txt");
          
          for(x=0;x<y;x++)
          {
               z++;
               big = big + z + "\n";
          }
          
          outputFile.println(big);
          outputFile.close();
          
     }
}