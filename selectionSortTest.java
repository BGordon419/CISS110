import java.util.Random;

public class selectionSortTest {

   public static void main(String[] args) {

      Random rand = new Random();
      int[] sorted, array = new int[10];

      // Fill array with random numbers
      for(int x=0;x<array.length;x++) {
         array[x] = rand.nextInt(array.length)+1;
         System.out.println(array[x]); // Outputs numbers
      }

      System.out.println();

      // retrive sorted array.
      sorted = SelectionSort(array);

      // Prints sorted numbers
      for(int x=0;x<sorted.length;x++) {
         System.out.println(sorted[x]);
      }
   }

   // Sorts array using bubble sort
   public static int[] SelectionSort(int array[]) {
      int x, y, temp, iteration; // Counter and holding variable
      boolean swapped = true;

      while(swapped) {
         swapped = false;
         for(x=0;x<array.length-1;x++) {

            for(y=0;y<array.length-1;y++) {

               // Checks to see if which od two numbers is larger
               if(array[x]>array[y-iteration]) {
                  temp = array[x];
                  array[x] = array[y-iteration];
                  array[y-iteration] = temp;

                  iteration++;
                  swapped = true;
                  // System.out.println(array[x] + ", " + array[x+1]);
               }

            }
         }
      }

      System.out.println();
      return array;

   }
}
