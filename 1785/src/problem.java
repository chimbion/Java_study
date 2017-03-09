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
      if (n >= 1000)
    	  out.println("legion");
      else if (n >= 500)
    	  out.println("zounds");
      else if (n >= 250)
    	  out.println("swarm");
      else if (n >= 100)
    	  out.println("throng");
      else if (n >= 50)
    	  out.println("horde");
      else if (n >= 20)
    	  out.println("lots");
      else if (n >= 10)
    	  out.println("pack");
      else if (n >= 5)
    	  out.println("several");
      else 
    	  out.println("few");
}

}