import java.util.Random;

public class selectionSortTest {

   public static void main(String[] args) {

      Random rand = new Random();
      int[] sorted, sorted2, array = new int[15];

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
      int x, y, index=0, smallest, temp;
      for(x=0;x<array.length-1;x++) {

         smallest = array[x];
         for(y=x+1;y<array.length;y++) {

            index = y;
            if(array[y]<smallest) {
               smallest = array[y];
               index = y;
            }
         }
         temp = smallest;
         array[index] = array[x];
         array[x] = smallest;

      }
      System.out.println();
      return array;

   }
}
