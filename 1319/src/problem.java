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
   int cnt;

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

   void print_d1(int n, int s)
   {
	  int j = n - s - 1;
	   for (int i = 0; i <= s; i++)
         arr[i][j++] = cnt++;
   }

   void print_d2(int n, int s)
   {
      int j = 0;
	  for (int i = s; i < n; i++)
        arr[i][j++] = cnt++;
   }
   
   void solve() throws IOException
   {
	  int n = nextInt();
	  arr = new int[n][n];

      cnt = 1;
	  for (int i = 0; i < n; i++)
	    print_d1(n, i);
	  for (int i = 1; i < n; i++)
		print_d2(n, i);
	  
	  String sep;
	  for (int i = 0; i < n; i++)
	  {		  
	      sep = "";  
		  for (int j = 0; j < n; j++)
	      {	
            out.print(sep);
	        out.print(arr[i][j]);
	        sep = " ";
	      }
		  out.println();
	  }
   }

}
