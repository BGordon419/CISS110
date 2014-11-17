import java.util.Scanner; // allows for user input

public class Payroll
{
     public static void main(String[] args)
     {
          Float grossPay, payRate, hours;
          Scanner InputDevice = new Scanner(System.in);
          
          System.out.print("Enter pay rate.");
          payRate = InputDevice.nextFloat();
          
          System.out.print("Enter number of hours worked.");
          hours = InputDevice.nextFloat();
          
          grossPay = hours * payRate;
          System.out.println("You gross pay is $" + grossPay);
     }
}