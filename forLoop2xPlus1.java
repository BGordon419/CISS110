public class forLoop2xPlus1
{
     public static void main(String[] args)
     {
          int x, y = 0;
          
          for(x=0;x<=10;x++)
          {
               y = y+y+1;
               System.out.println(y);
          }  
     }
}