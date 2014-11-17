import javax.swing.JOptionPane;

public class GordonBrandonAssignment6b {
     
     public static void main(String[] args) {
          
          int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter an account number to check.",0));
          
          if(CheckNumber(accountNumber)==true)
               JOptionPane.showMessageDialog(null,"That account number is valid.");
          else
               JOptionPane.showMessageDialog(null,"That account number is invalid.");
          
     }
     
     public static boolean CheckNumber(int number){
          
          boolean value = false;
          int accountNumbers[][] = GenerateArray();
          
          for(int y=0;y<3;y++) {
               
               for(int x=0;x<6;x++) {
                    
                    if(accountNumbers[x][y]==number)
                         value = true;
                    
                    if(value==true)
                         break;
               }
               
               if(value==true)
                    break;
          }
          
          return value;
          
     }
     
     public static int[][] GenerateArray() {
          
          int accountNumbers[][] = new int[6][3];
          
          accountNumbers[0][0] = 5658845;
          accountNumbers[1][0] = 4520125;
          accountNumbers[2][0] = 7895122;
          accountNumbers[3][0] = 8777541;
          accountNumbers[4][0] = 8451277;
          accountNumbers[5][0] = 1302850;
          accountNumbers[0][1] = 8080152;
          accountNumbers[1][1] = 4562555;
          accountNumbers[2][1] = 5552012;
          accountNumbers[3][1] = 5050552;
          accountNumbers[4][1] = 7825877;
          accountNumbers[5][1] = 1250255;
          accountNumbers[0][2] = 1005231;
          accountNumbers[1][2] = 6545231;
          accountNumbers[2][2] = 3852085;
          accountNumbers[3][2] = 7576651;
          accountNumbers[4][2] = 7881200;
          accountNumbers[5][2] = 4581002;
          
          return accountNumbers;
     }
}