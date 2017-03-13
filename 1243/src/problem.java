import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.Writer;

public class problem {

   public static void main(String[] args) throws IOException
   {
      new problem().run();
   }

   BufferedReader in;
   PrintWriter out;


   void run() throws IOException
   {
	  boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	  Reader reader = oj ? new InputStreamReader(System.in) : new FileReader("input.txt");
	  Writer writer = oj ? new OutputStreamWriter(System.out) : new FileWriter("output.txt");
	  in = new BufferedReader(reader);
	  out = new PrintWriter(writer);
	  solve();
      out.flush();
   }

   
   void solve() throws IOException
   {
	 StringBuffer str = new StringBuffer(in.readLine());
	 str = str.reverse();
     int s = 0;
     int[] a = {1, 3, 2, 6, 4, 5};
     int j = 0;
     
     for (int i = 0; i < str.length(); i++)
     {	 
    	 s += a[j++] * Integer.parseInt(str.substring(i, i + 1));
    	 if (j == 6)
    		 j = 0;
     } 	 
     
     out.print(Math.floorMod(s, 7));
      
      
   }

}
