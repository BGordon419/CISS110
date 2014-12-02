import java.util.Random;

public class selectionSortTest {

   public static void main(String[] args) {

      Random rand = new Random();
      int[] sorted, sorted2, array = new int[20];

      // Fill array with random numbers
      for(int x=0;x<array.length;x++) {
         array[x] = rand.nextInt(array.length)+1;
         System.out.println(array[x]); // Outputs numbers
      }

      System.out.println();

      // retrieve sorted array.
      sorted = SelectionSort(array);

      // Prints post-sorted numbers
      for(int x=0;x<sorted.length;x++) {
         System.out.println(sorted[x]);
      }
   }

   // Sorts array using selection sort
   public static int[] SelectionSort(int array[]) {

      int smallest, x, y, index;
      for(x=0;x<array.length;x++) {

         index = x;
         smallest = array[x];

         // Finds smallest number
         for(y=x;y<array.length;y++) {
            if(array[y]<smallest) {
               smallest = array[y];
               index = y;
            }
         }

         //Swaps array[x] with smallest number in the array
         array[index] = array[x];
         array[x] = smallest;

      }
      return array;
   }
}
