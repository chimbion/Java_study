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

   class pair implements Comparable<pair>
   {
	   int ID, M;
	   pair(int ID, int M)
	   {
		   this.ID = ID;
		   this.M = M;
	   }
	   public String toString()
	   {
		   return String.format("%d %d\n", ID, M);
	   }
	   public int compareTo(pair p)
	   {
		   return p.M - this.M;
	   }
   }
   
   void solve() throws IOException
   {
      int n = nextInt();
      List<pair> pairs = new ArrayList<>();
      for (int i = 0; i < n; i++)
      {
    	  pairs.add(new pair(nextInt(), nextInt()));
      }
      pairs.sort(new Comparator<pair>()
      {public int compare(pair p1, pair p2) {return p2.M - p1.M;}}
      );
      for (int i = 0; i < n; i++)
      {
    	  out.print(pairs.get(i));
      }

   }

}