import java.util.Random;
import javax.swing.JOptionPane;

public class CodingAssignment2e
{
     public static void main(String[] args)
     {
          int array[][], guess, response;
          array = new int[4][4];
          Random rand = new Random();

          // Generates random Array
          for(int x=0;x<=3;x++)
          {
               for(int y=0;y<=3;y++)
               {
                    array[x][y] = rand.nextInt(100)+100;
               }
          }

          System.out.println("There are '" + Even(array) + "' even numbers.");

          do
          {
               guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your guess."));
               response = Findit(array, guess);

               if(response==1)
                    JOptionPane.showMessageDialog(null,"Your guess was correct!");
               else if( guess==-1)
                    JOptionPane.showMessageDialog(null,"You have ended the program");
               else
                    JOptionPane.showMessageDialog(null,"Your guess was incorrect");
          }
          while ( guess!=-1 );

          System.out.println("'" + Largest(array) + "' is the largest number.");
          System.out.println("'" + Smallest(array) + "' is the smallest number.");
          System.out.println();
          PrintThem(array);
     }

     public static int Largest( int [ ][ ] numbers)
     {
          int largest = 0;
          for(int x=0;x<=3;x++)
          {
               for(int y=0;y<=3;y++)
               {
                    if(numbers[x][y]>largest)
                         largest = numbers[x][y];
               }
          }
          return largest;
     }

     public static int Smallest(int [ ][ ] numbers)
     {
          int smallest = 200;
          for(int x=0;x<=3;x++)
          {
               for(int y=0;y<=3;y++)
               {
                    if(numbers[x][y]<smallest)
                         smallest = numbers[x][y];
               }
          }
          return smallest;
     }

     public static int Even(int [ ][ ] numbers)
     {
          int evenCount = 0;

          for(int x=0;x<=3;x++)
          {
               for(int y=0;y<=3;y++)
               {
                    if(numbers[x][y]%2==0)
                         evenCount++;
               }
          }
          return evenCount;
     }

     public static int Findit(int [ ][ ] numbers, int guess)
     {
          int correct = 0;

          for(int x=0;x<=3;x++)
          {
               for(int y=0;y<=3;y++)
               {
                    if(guess==numbers[x][y])
                         correct = 1;
               }
          }

          if(correct == 1)
               return 1;
          else
               return 0;
     }

     public static void PrintThem( int[][] numbers )
     {
          for(int x=0;x<=3;x++)
          {
               for(int y=0;y<=3;y++)
               {
                    System.out.println( x + "," + y + " : " + numbers[x][y]);
               }
               System.out.println();
          }
     }
}
