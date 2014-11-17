import javax.swing.JOptionPane;

public class letterGrade
{
     
     public static void main(String[] args)
     {
          // Inputs
          String grade = JOptionPane.showInputDialog("Enter grade value.");
          
          // Outputs - sends user input to 'letterGrade' Method
          JOptionPane.showMessageDialog(null,letterGrade(Integer.parseInt(grade)));
     }
     
     // recives 2 numbers, outputs letter of the input grade.
     public static String letterGrade(int num)
     {
          if(num<=100&&num>=90)
               return "A";
          if(num<=89&&num>=80)
               return "B";
          if(num<=79&&num>=70)
               return "C";
          if(num<=69&&num>=60)
               return "D";
          if(num<60)
               return "F";
          else
               return "Invalid grade.";
     }
     
}