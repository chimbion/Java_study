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
import java.util.StringTokenizer;

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
      String str = in.readLine();
      char letter = str.charAt(str.length() - 1);
      int row = Integer.parseInt(str.substring(0, str.length() - 1));
      String res = "";
      if (row <= 2)
    	  switch (letter)
    	  {
    	  case 'A': case 'D': res = "window"; break;
    	  case 'B': case 'C': res = "aisle"; break;
    	  }
      else if (row <= 20) 
		  switch (letter)
		  {
		  case 'A': case 'F': res = "window"; break;
		  case 'B': case 'C': case 'D': case 'E': res = "aisle"; break;
		  }
      else  
		  switch (letter)
		  {
		  case 'A': case 'K': res = "window"; break;
		  case 'C': case 'D': case 'G': case 'H': res = "aisle"; break;
		  default: res = "neither"; 
		  }
      out.print(res);
      
   }

}
