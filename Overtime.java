/* Prompt user for hours and pay rate
 * caculate weekly pay
 * hours > 40 are paid 1.5 * payrate
 */

import javax.swing.JOptionPane;

public class Overtime
{
     public static void main(String[] args)
     {
          // declare variables + constants
          float hours, payRate, netPay;
          int payRateInt, hoursInt;
          
          // Get user inputs for pay rate and number of hours worked
          hours = Float.parseFloat(JOptionPane.showInputDialog("Enter number of hours worked."));
          payRate = Float.parseFloat(JOptionPane.showInputDialog("Enter your current rate of pay."));
          
          netPay = payRate * hours;
          
          // Check if overtime is required
          if( hours > 40)
          {
               netPay = payRate * 40;
               netPay = netPay + (hours - 40) * (float)1.5 *payRate;
          }
          
          // Outputs to user
          JOptionPane.showMessageDialog(null,"Your weekly net pay is $" + netPay);
          
     }
}