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
import java.util.StringTokenizer;

public class problem {

   public static void main(String[] args) throws IOException
   {
      new problem().run();
   }

   BufferedReader in;
   PrintWriter out;


   void run() throws IOException
   {
	  boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	  Reader reader = oj ? new InputStreamReader(System.in) : new FileReader("input.txt");
	  Writer writer = oj ? new OutputStreamWriter(System.out) : new FileWriter("output.txt");
	  in = new BufferedReader(reader);
	  out = new PrintWriter(writer);
	  solve();
      out.flush();
   }


   void solve() throws IOException
   {
      String str = in.readLine();
	  StringTokenizer st = new StringTokenizer(str, " ");
	  int H = Integer.parseInt(st.nextToken());
	  int W = Integer.parseInt(st.nextToken());
	  int N = Integer.parseInt(st.nextToken());
	  int n = 0, h = 1, w = 0;
	  for (int i = 0; i < N; i++)
	  {
		  str = in.readLine();
		  if (w + str.length() > W)
		  {
	        w = 0;
	        if (++h > H)
	        {
	        	n++;
	        	h = 1;
	        }
		  }
     	 w += str.length() + 1;
		  
	  };
      
	  out.print(++n);
      
   }

}
