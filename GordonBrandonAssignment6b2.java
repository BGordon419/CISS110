import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

public class GordonBrandonAssignment6b2 {

   public static void main(String[] args) throws IOException {

      //Asks user to input account number to test
      int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter an account number to check.",0));

      //Checks value against existing file containing accounts numbers
      if(CheckNumber(accountNumber)==true)
         JOptionPane.showMessageDialog(null,"That account number is valid.");
      else
         JOptionPane.showMessageDialog(null,"That account number is not valid.");
   }

   // Takes number from user and checks it against the account number file
   public static boolean CheckNumber(int number) throws IOException {

      boolean value = false;
      int accountNumbers[][] = ReadArray();
      int[] arraySize = ArraySize();

      for(int x=0;x<arraySize[0];x++) {

         // Checks size of the array of account numbers
         // If the size wasn't divisible by 2 or 3, it will create one long array.
         if(arraySize[1] == 0) {
            if(accountNumbers[x][0]==number) {
               value = true;
               break;
            }
         } else {

            for(int y=0;y<arraySize[1];y++) {

               if(accountNumbers[x][y]==number) {
                  value = true; // If number is found, cancel search
                  break;
               }
            }
         }
         if(value==true)
            break;
      }

      return value;
   }

   //Reads the account numbers into an array
   public static int[][] ReadArray() throws IOException {

      // Creates arrays
      int[] arraySize = ArraySize();
      int[][] array = new int[arraySize[0]][arraySize[1]];

      //Creates files
      File file = new File(System.getProperty("user.dir") + "/accountNumbers.txt");
      Scanner inputFile = new Scanner(file);

      // Reads into array
      for(int x=0;x<arraySize[0];x++) {

         if(arraySize[1] == 0) {
            array[x][0] = Integer.parseInt(inputFile.nextLine());
            
         } else {
            for(int y=0;y<arraySize[1];y++) {

               array[x][y] = Integer.parseInt(inputFile.nextLine());
            }
         }
      }

      return array;
   }

   public static int[] ArraySize() throws IOException {

      //Determines number of lines
      File dataFile = new File(System.getProperty("user.dir") + "/accountNumbers.txt");
      FileReader fr = new FileReader(dataFile);
      LineNumberReader lnr = new LineNumberReader(fr);

      int linenumber = 0;
      while (lnr.readLine() != null) {
         linenumber++;
      }

      int[] numberOfLines = new int[2];
      if(linenumber % 3 == 0) {
         numberOfLines[0] = linenumber / 3;
         numberOfLines[1] = 3;

      } else if( linenumber % 2 == 0) {
         numberOfLines[0] = linenumber / 2;
         numberOfLines[1] = 2;

      } else {
         numberOfLines[0] = linenumber;
         numberOfLines[1] = 1;

      }

      lnr.close();
      fr.close();

      return numberOfLines;
   }
}
