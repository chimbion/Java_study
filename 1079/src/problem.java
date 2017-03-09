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

   int get_max(int n)
   {
     int res = -1;
     int[] a = new int[n+1];
     a[0] = 0;
     a[1] = 1;
     for (int i = 2; i <= n; i++)
     {
    	if (Math.floorMod(i, 2) == 0)
    		a[i] = a[i/2];
    	else
    		a[i] = a[Math.floorDiv(i, 2)] + a[Math.floorDiv(i, 2) + 1];
     }
     for (int i = 0; i <= n; i++)
    	 if (a[i] > res)
    	   res = a[i];
     return res;
   }
   
   void solve() throws IOException
   {
      int n = nextInt();
      while (n > 0)
      {
        out.println(get_max(n));
        n = nextInt();
      } 
   }

}