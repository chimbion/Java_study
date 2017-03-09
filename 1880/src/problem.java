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
      int n_a = nextInt();
      int[] a = new int[n_a];
      for (int i = 0; i < n_a; i++)
    	  a[i] = nextInt();
      
      int n_b = nextInt();
      int[] b = new int[n_b];
      for (int i = 0; i < n_b; i++)
    	  b[i] = nextInt();

      int n_c = nextInt();
      int[] c = new int[n_c];
      for (int i = 0; i < n_c; i++)
    	  c[i] = nextInt();
      
      int c_a = 0, c_b = 0, c_c = 0, cnt = 0;
      
      while ((c_a < n_a) && (c_b < n_b) && (c_c < n_c))
      {
    	  if ((a[c_a] == b[c_b]) && (a[c_a] == c[c_c]))
    	  {	  
    		  cnt++;
    		  c_a++; c_b++; c_c++;
    	  }
    	  else
    	  {	  
        	  if ((a[c_a] <= b[c_b]) && (a[c_a] <= c[c_c])) c_a++;
        	  else if ((b[c_b] <= a[c_a]) && (b[c_b] <= c[c_c])) c_b++;
        	  else if ((c[c_c] <= a[c_a]) && (c[c_c] <= b[c_b])) c_c++;
    	  }    
    	  
    
      }
      out.print(cnt);
   }    
 }

