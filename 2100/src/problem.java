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
      int n = Integer.parseInt(in.readLine());
      int cnt = 2;
      for (int i = 0; i < n; i++)
      {
    	  String str = in.readLine();
    	  if (str.length() > 4)
    	  {	  
    		  if (str.substring(str.length() - 4, str.length()).equals("+one"))
    		    cnt +=2;
    		  else
    			cnt +=1;
    	  }
    	  else cnt +=1;
    		  
      }
      if (cnt == 13)
    	 cnt++;
      out.print(cnt * 100);
      
   }

}
