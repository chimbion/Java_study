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
import java.util.*;

public class problem {

   public static void main(String[] args) throws IOException
   {
      new problem().run();
   }

   StreamTokenizer in;
   PrintWriter out;
   int[] s;

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
      List<Integer>[] ids = new ArrayList[101];
      for (int i = 0; i <= 100; i++)
    	  ids[i] = new ArrayList<Integer>();
      
      for (int i = 0; i < n; i++)
      {	  
    	  int id = nextInt();
    	  int m = nextInt();
     	  ids[m].add(id);
      }
      for (int j = 100; j >= 0; j--)
	      for (int i = 0; i < ids[j].size(); i++)
	      {
	    	  out.print(ids[j].get(i));
	    	  out.print(" ");
	    	  out.println(j);
	      }	  
	      

   }

}