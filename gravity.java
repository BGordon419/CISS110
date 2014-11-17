public class gravity
{
     public static void main(String[] args)
     {
          for(int x=1;x<=10;x++)
          {
               System.out.println(fallingDistance(x));
          }
          
     }
     
     public static double fallingDistance(double time)
     {
          return time*time*.5*9.8;
     }
     
}