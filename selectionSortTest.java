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

      sorted2 = SelectionSort2(array);
      System.out.println();
      for(int x=0;x<sorted.length;x++) {
         System.out.println(sorted[x]);
      }
   }

   // Sorts array using bubble sort
   public static int[] SelectionSort(int array[]) {
      int x, y, temp, lowest = array[0], index; // Counter and holding variable

      for(x=array.length-1;x>0;x++) {

         index=0;
         for(y=1;y<=x;y++) {

            if(array[y]>array[index]) {
               index = y;
            }
         }
         temp = array[index];
         array[index] = array[x];
         array[x] = temp;
      }

      System.out.println();
      return array;

   }

   public static int[] SelectionSort2 ( int[] num ) {
      int i, j, first, temp;
      for ( i=num.length-1; i>0; i-- )
      {
         first = 0;   //initialize to subscript of first element
         for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
         {
            if( num[ j ] < num[ first ] )
               first = j;
         }
         temp = num[ first ];   //swap smallest found with element in position i.
         num[ first ] = num[ i ];
         num[ i ] = temp;
      }
      return num;
   }
}
