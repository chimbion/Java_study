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

   int get_shelf(String addresee)
   {
	   int res = 0;
	   switch (addresee.charAt(0))
	   {
	     case 'A': 
	     case 'P': 
	     case 'O': 
	     case 'R':
	       res = 1;
	       break;
	     case 'B': 
	     case 'M': 
	     case 'S': 
	       res = 2;
	       break;
	     case 'D': 
	     case 'G': 
	     case 'J': 
	     case 'K':
	     case 'T':
	     case 'W':
	       res = 3;
	       break;
	   };
	   return res;
   }
   void solve() throws IOException
   {
	  int n = nextInt();
	  long cnt = 0;
	  int cur = 1;
	  for (int i = 0; i < n; i++)
	  {
		  String str = nextString();
		  int tar = get_shelf(str);
		  if (tar > 0)
		  {
		    cnt += Math.abs(cur - tar);
		    cur = tar;
		  }  
	  };
	  out.print(cnt);
      
      
   }

}
