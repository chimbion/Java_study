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

   long get_n(long n)
   {
	   long s = 0, a = 2, b = 2;
	   if ((n==1) || (n==2))
	     s = 2;
       else
    	   for (int i = 3; i <=n; i++)
    	   {	   
    		   s = a + b;
    		   a = b;
    		   b = s;
    	   }
	   return s;
   }
   
   
   void solve() throws IOException
   {
	  long n = nextInt();
	  out.print(get_n(n));
   }

}
