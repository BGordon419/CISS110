import java.io.*;

public class fileReadTest {

   public static void main(String[] args) throws IOException {

     File dataFile =new File(System.getProperty("user.dir") + "/accountNumbers.txt");
     //PrintWriter dataFile = new PrintWriter("%CD%/accountNumbers.txt");
     FileReader fr = new FileReader(dataFile);
     LineNumberReader lnr = new LineNumberReader(fr);

     int linenumber = 0;

     while (lnr.readLine() != null)
       linenumber++;

     BufferedReader br = new BufferedReader(fr);
     String line = br.readLine();

     while (line != null) {
        System.out.println(line);
     }
     br.close();


    System.out.println(linenumber);
  }
}
