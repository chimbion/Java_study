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
import java.util.*;

public class problem {

   public static void main(String[] args) throws IOException
   {
      new problem().run();
   }

   StreamTokenizer in;
   PrintWriter out;
   int[] s;

   int nextInt() throws IOException
   {
      in.nextToken();
      return (int)in.nval;
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

   long f(int x, int n, int m)
   {
	   long res;
	   if (n == 0)
		   res = Math.floorMod(1, m);
	   else
		   res = Math.floorMod(f(x, n-1, m) * x, m);
	   return res;
   }
   
   void solve() throws IOException
   {
      int n = nextInt();
      int m = nextInt();
      int y = nextInt();
      int cnt = 0;
      
      for (int x = 0; x < m; x++)
      {
    	  if (f(x, n, m) == y)
    	  {
    		  out.print(x);
    		  out.print(" ");
    		  cnt++;
    	  }
      }
      if (cnt == 0)
    	  out.print(-1);
      
   }

}