import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class test
{
     public static void main(String[] args)
     {
          int hours = 45;
          double pay, payRate = 10.00;
          pay = hours <= 40 ? hours * payRate : 
               40 * payRate + (hours - 40) * payRate * 1.5;
          
          System.out.println(pay);
     }
}