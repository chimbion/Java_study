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
   int arr[][];

   long nextInt() throws IOException
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

   int get_num(long k)
   {
	 if (k > 1)
	 {
	   double s = Math.floor((-1 + Math.sqrt(1 + 8 * k)) /2);
	   double f = (1 + s) / 2 * s;
	   if (f + 1 == k)
	     return 1;
	   else 
		 return 0;
	 }
	 else return 1;
   }

   
   void solve() throws IOException
   {
	  long n = nextInt();
	  for (int i = 0; i < n; i++)
		  out.print(get_num(nextInt()) + " ");
   	    	  
	  
   }

}
