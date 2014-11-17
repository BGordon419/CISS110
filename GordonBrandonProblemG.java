public class GordonBrandonProblemG {

   public static void main(String[] args) {
      int[] array = new int[10]

      // Fill array
      for(int x=0;x<array.length;x++)
         array[x] = array.length-x;

      // Add and initialize variables
      int index, temp = array[0], smallest = temp;

      //Find smallest number and index
      for(int x=0;x<array.length;x++) {
         if(array[x]<smallest) {
            smallest = array[x];
            index = x;
         }
      }

      //Swap first and smallest values
      array[0] = smallest;
      array[index] = temp;
   }
}
