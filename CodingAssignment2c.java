import java.util.Random;
import javax.swing.JOptionPane;

public class CodingAssignment2c {
   /**   Brandon Gordon
     *    Douglas Cochrane
     *    Shreshta Kota
     */
   
   public static void main(String[] args) {
      
      int arraySize = Integer.parseInt(JOptionPane.showInputDialog("Input the size of the arary."));
      int[] array = new int[arraySize];
      
      Random(array);          // First Method
      DisplayArray(array);    // Second Method
      System.out.println();   // Seperator
      BubbleSort(array);      // Third Method
      DisplayArray(array);    // Second Method
      
   }
   
   // Fills array with random numbers between 1 & 1000
   public static void Random(int[] array) {
      
      Random rand = new Random();
      
      for(int x=0;x<array.length;x++)
         array[x] = rand.nextInt(999)+1;
   }
   
   // Outputs array
   public static void DisplayArray(int[] array) {
      for(int x=0;x<array.length;x++)
         System.out.println(array[x]);
   }
   
   // Sorts array using Bubble Sort
   public static void BubbleSort(int[] array) {
      
      int temp;
      boolean swapped = true;
      
      while(swapped==true) {
         
         swapped = false;
         
         for(int x=0;x<array.length-1;x++) {
            
            if(array[x]>array[x+1]) {
               
               // Swaps if first number is larger
               temp = array[x];
               array[x] = array[x+1];
               array[x+1] = temp;
               swapped = true;
            }
         }
      }
   }
}
