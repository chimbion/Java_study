import java.io.*;
import java.util.*;


public class problem1001 {

   public static void main(String[] args) throws IOException
   {
      new problem1001().run();
   }

   StreamTokenizer in;
   PrintWriter out;
   
  
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
      long[] numbers = new long[1024 * 256];
      int cnt = 0;
      
	  while (in.nextToken() == StreamTokenizer.TT_NUMBER)
      {	  
        long a = (long)in.nval;
        numbers[cnt++] = a;
      }
	  
	  for (int i = cnt - 1  ; i >= 0; i--)
	  {
        double b = Math.sqrt(numbers[i]);
	    out.printf(Locale.US, "%.4f", b);
	    out.println();
	    
	  }
   }

}
