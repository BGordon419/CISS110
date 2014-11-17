/* Prompt for temperature
 * if < than 60
 * display "Wear a coat!"
 */ 

import javax.swing.JOptionPane;

public class wearACoat
{
     public static void main (String[] args)
     {
          // Assigns variables
          String temperatureString;
          Float temperature;
          
          // Gets temperature from user --> String
          temperatureString = JOptionPane.showInputDialog("Enter the current temperature.");
          // Parses String --> float
          temperature = Float.parseFloat(temperatureString);
          
          if (temperature < 60)
          {
               // Outputs "Wear a coat!"
               JOptionPane.showMessageDialog(null,"Wear a coat!");
          }
     }
}