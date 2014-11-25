import java.util.Random;
import javax.swing.JOptionPane;

public class GordonBrandon_Array {

     public static void main(String[] args) {

        int array[] = new int[20];

        int guess = 0;

        // Fills array with random numbers
        Random(array);

        System.out.println("'" + Largest(array) + "' is the largest number.");
        System.out.println("'" + Smallest(array) + "' is the smallest number.");
        System.out.println("There are '" + Even(array) + "' even numbers.");
        System.out.println();

        while(guess!=-1) {
           guess = Integer.parseInt(JOptionPane.showInputDialog("Take a guess!\n Enter '-1' to end."));

           if(Findit(array, guess) == true)
               System.out.println("You guessed correctly!");
           else
               System.out.println("You did not guess correctly!");
        }

        System.out.println();
        PrintThem(array);
     }

     public static int Largest( int [ ] numbers ) {
        int largest = numbers[0], x;
        for(x=0;x<numbers.length;x++) {
           if(numbers[x]>largest)
               largest = numbers[x];
        }
        return largest;
     }

     public static int Smallest(int [ ] numbers ) {
        int smallest = numbers[0], x;
        for(x=0;x<numbers.length;x++) {
           if(numbers[x]<smallest)
           smallest = numbers[x];
        }
        return smallest;

     }

     public static int Even(int [ ] numbers ) {
        int evenCount = 0, x;
        for(x=0;x<numbers.length;x++) {
           if(numbers[x] % 2 == 0)
               evenCount++;
        }
        return evenCount;

     }

     public static boolean Findit(int [ ] numbers, int guess ) {
        int x;

        for(x=0;x<numbers.length;x++) {
           if(guess==numbers[x])
               return true;
        }
        return false;
     }

     public static void PrintThem( int [ ] numbers ) {
        int evenCount = 0, x;
         for(x=0;x<numbers.length;x++)
            System.out.println(numbers[x]);

     }

     public static void Random(int[] array) {

        Random rand = new Random();

        for(int x=0;x<array.length;x++)
        array[x] = rand.nextInt(100)+100;
     }
}
