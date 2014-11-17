// Jesse Urban, james cullen, Brandon Gordon

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomDice
{
     public static void main(String[] args) throws IOException
     {
          String filename = JOptionPane.showInputDialog("Enter filename."); // Gets filename from user
          
          // Assingns variables
          int die1, die2;
          Random rand = new Random();
          
          PrintWriter file = new PrintWriter(filename + ".txt"); //Opens file
          
          JOptionPane.showMessageDialog(null,"Rolling Dice..."); // Displays "Rolling Dice..."
          
          // Rolls Dice
          die1 = rand.nextInt(6)+1;
          die2 = rand.nextInt(6)+1;
          
          JOptionPane.showMessageDialog(null,die1 +  " " + die2 ); // Outputs to user
          
          file.println(die1 + " , " + die2 + "\n"); // Writes to file
          
          //Scanner readFile = new Scanner(file);
          //String read = file.nextLine();
          //JOptionPane.showMessageDialog(null,file.nextLine());
          
          file.close(); // Closes file
          
     }
}