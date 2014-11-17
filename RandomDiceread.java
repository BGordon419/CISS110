// Jesse Urban, james cullen, Brandon Gordon

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomDiceread
{
     public static void main(String[] args) throws IOException
     {
          String filename = JOptionPane.showInputDialog("Enter filename."); // Gets filename from user
          
          // Assingns variables
          int die1, die2;
          Random rand = new Random();
          
          PrintWriter writeFile = new PrintWriter(filename + ".txt"); //Opens file
          
          JOptionPane.showMessageDialog(null,"Rolling Dice..."); // Displays "Rolling Dice..."
          
          // Rolls Dice
          die1 = rand.nextInt(6)+1;
          die2 = rand.nextInt(6)+1;
          
          JOptionPane.showMessageDialog(null,die1 +  " , " + die2 ); // Outputs to user
          
          writeFile.println(die1 + " , " + die2 + "\n"); // Writes to file
          
          writeFile.close(); // Closes file
          
          File readFile = new File(filename + ".txt");
          
          Scanner scanner = new Scanner(readFile);
          String read = scanner.nextLine();
          
          JOptionPane.showMessageDialog(null,read);
          
          writeFile.close(); // Closes file
          
     }
}