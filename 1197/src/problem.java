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

   String nextString() throws IOException
   {
      in.nextToken();
      return (String)in.sval;
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
      for (int i = 0; i < n; i++)
      {
          String str = nextString();
    	  int x = str.codePointAt(0) - (new String("a")).getBytes()[0] + 1;
    	  int y =  Integer.parseInt(str.substring(1));
    	  int cnt = 0;
    	  
    	  if ((x - 1 > 0) && (y + 2 < 9)) cnt++;
    	  if ((x + 1 < 9) && (y + 2 < 9)) cnt++;
    	  if ((x + 2 < 9) && (y + 1 < 9)) cnt++;
    	  if ((x + 2 < 9) && (y - 1 > 0)) cnt++;
    	  if ((x + 1 < 9) && (y - 2 > 0)) cnt++;
    	  if ((x - 1 > 0) && (y - 2 > 0)) cnt++;
    	  if ((x - 2 > 0) && (y - 1 > 0)) cnt++;
    	  if ((x - 2 > 0) && (y + 1 < 9)) cnt++;

    	  out.println(cnt);
      }
    	  
      
      
   }

}
