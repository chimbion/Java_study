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

   void solve() throws IOException
   {
      int cur = -1, prev = -1, cnt = 0;
	  int n = nextInt();
      for (int i = 0; i <= n; i++)
      {
    	 if (i< n) cur = nextInt(); 
    	 else cur = -1;
    	 if (prev != cur)
    	 {
    		 if (prev > 0)
    		 {
    			 out.print(cnt);
    			 out.print(" ");
    			 out.print(prev);
    			 out.print(" ");
     		 }
    		 prev = cur;
    		 cnt = 0;
   		 }
    	 cnt++;
    	 }
    	 	 
      }

   }


