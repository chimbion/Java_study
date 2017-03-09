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
      int n = nextInt();
      int[] wall = new int[n+2];
      wall[0] = 0; wall[n+1] = 0;
      for (int i = 1; i < n+2; i++)
    	  wall[i] = nextInt();
      int max = -1, c = -1;
      for (int i = 1; i < n + 1; i++)
      {
    	  int s = wall[i-1] + wall[i] + wall[i+1];
    	  if (max < s)
    	  {
    		  max = s;
    		  c = i;
    	  }
      }
      out.print(max);
      out.print(" ");
      out.print(c);
   }
 }    
 

