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
   
   boolean test(long n, long c)
   {
     boolean res = false;
     long m = 1;
     String str = String.valueOf(c);
     for (int i = 0; i < str.length(); i++)
    	 m *= Integer.parseInt(str.substring(i, i+1));
     if (m == n) 
       res = true;
     return res;
   }
   
   void solve() throws IOException
   {
      long n = nextLong();
      long res = 0;
      boolean found = false;
      while (!found && (res < n))
      {
    	  if (test(n, res))
    	    found = true;
    	  else
    	    res++;
      }
      
      if (found)
        out.print(res);
      else
        out.print(-1);
   }

}
