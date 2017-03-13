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

   boolean is_lucky(int n)
   {
	   boolean res = false;
	   String z = "00000";
	   String str = z.substring(0, 6 - String.valueOf(n).length()) + String.valueOf(n);
	   
	   
	   res = Integer.parseInt(str.substring(0, 1)) +
			   Integer.parseInt(str.substring(1, 2)) +  
			   Integer.parseInt(str.substring(2, 3))  
		 == Integer.parseInt(str.substring(3, 4)) +
		 Integer.parseInt(str.substring(4, 5)) +
		 Integer.parseInt(str.substring(5, 6));
	   return res;
   }
   
   void solve() throws IOException
   {
	   int n = nextInt();
	   if ((is_lucky(n-1)) || (is_lucky(n+1)))
		   out.print("Yes");
	   else
		   out.print("No");
   }

}
