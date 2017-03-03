import java.io.*;
import java.util.*;

public class problem {

   public static void main(String[] args) throws IOException
   {
      new problem().run();
   }

   StreamTokenizer in;
   PrintWriter out;
   
   Vector group = new Vector();
   Vector list = new Vector();

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

   void fill_list(int a, int index, int K)
   {
       list.add(a);
       for (int i = index + 1; i < K; i++)
           fill_list(a + (int)group.get(i), i, K);
   }
   
   void solve() throws IOException
   {
	   int K, k, S = 0, min;
	   K = nextInt();
	   for (int i = 0; i < K; i++)
	   {
		  int a = nextInt();
		   group.add(a);
		   S += a;
	   }	   
	   
	   for (int i = 0; i < K; i++)
		   fill_list((int)group.get(i), i, K);
	   
	   k = S / 2;
	   min = 1000000;

	   for (int i = 0; i < list.size(); i++)
	   {	   
		   if (Math.abs(k - (int)list.get(i)) < Math.abs(k - min))
		     min = (int)list.get(i);
	   }	    		 
	   
	   S = Math.abs(S - min - min);
	   
	   out.println(S);
   }

}
