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

   StreamTokenizer in;
   PrintWriter out;

   long nextLong() throws IOException
   {
      in.nextToken();
      return (long)in.nval;
   }

  
   void run() throws IOException
   {
	  boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	  Reader reader = oj ? new InputStreamReader(System.in) : new FileReader("input.txt");
	  Writer writer = oj ? new OutputStreamWriter(System.out) : new FileWriter("output.txt");
	  in = new StreamTokenizer(new BufferedReader(reader));
	  out = new PrintWriter(writer);
	  solve();
      out.flush();
   }
   
   
   void solve() throws IOException
   {
      long n = nextLong();
      
      String res = "";
      
      if (n == 0)
    	  out.print("10");
      else if (n < 10)
    	  out.print(String.valueOf(n));
      else
      {   
        int i = 9;
        while (i > 1)
        {
    	  if (Math.floorMod(n, i) == 0)
    	  {
    	    res = String.valueOf(i) + res;
    	    n = n / i;
    	  }
    	  else 
    		  i--;
        }
        if ((res.length() > 0) && (n == 1))
            out.print(res);
          else
            out.print(-1);
      } 
      
   }

}
