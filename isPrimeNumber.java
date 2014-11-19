import javax.swing.JOptionPane;

public class isPrimeNumber {

     public static void main(String[] args) {
          // Inputs
          String number = JOptionPane.showInputDialog("Enter a number.");

          // Outputs - sends user input to 'isPrime' Method
          JOptionPane.showMessageDialog(null,isPrime(Integer.parseInt(number)));
     }

     // Modified from http://en.wikipedia.org/wiki/Primality_test#Java_implementation
     public static boolean isPrime(int n) {

          if(n <= 3 && n > 1)
               return true;
          else if(n % 2 == 0 || n % 3 == 0 || n == 1)
               return false;
          else {
               for(int x = 5; x * x <= n; x += 6) {
                    if(n % x == 0 || n % (x + 2) == 0)
                         return false;
               }
               return true;
          }
     }
}
