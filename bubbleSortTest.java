import java.util.Random;

public class bubbleSortTest {

   public static void main(String[] args) {

      Random rand = new Random();
      int[] sorted, array = new int[1000];

      // Fill array with random numbers
      for(int x=0;x<array.length;x++) {
         array[x] = rand.nextInt(array.length)+1;
         System.out.println(array[x]); // Outputs numbers
      }

      System.out.println();

      // retrive sorted array.
      sorted = BubbleSort(array);

      // Prints sorted numbers
      for(int x=0;x<sorted.length;x++) {
         System.out.println(sorted[x]);
      }
   }

   // Sorts array using bubble sort
   public static int[] BubbleSort(int array[]) {
      int x, temp; // Counter and holding variable
      boolean swapped = true;

      while(swapped) {
         swapped = false;
         for(x=0;x<array.length-1;x++) {

            // Checks to see if which od two numbers is larger
            if(array[x]>array[x+1]) {
               temp = array[x];
               array[x] = array[x+1];
               array[x+1] = temp;

               swapped = true;
               // System.out.println(array[x] + ", " + array[x+1]);
            }
         }
      }
      System.out.println();
      return array;

   }
}
