public class GordonBrandonProblemG {

   public static void main(String[] args) {
      int[] array = new int[10]
      int index, temp = array[0], smallest = temp;

      for(int x=0;x<array.length;x++) {
         if(array[x]<smallest) {
            smallest = array[x];
            index = x;
         }
      }

      array[0] = smallest;
      array[index] = temp;
   }
}
