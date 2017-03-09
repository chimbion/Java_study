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

   
   void get_simple(int n)
   {
     int i = 4;
     int j = 11;
     s[0] = 2;
     s[1] = 3;
     s[2] = 5;
     s[3] = 7;
     while (i < n)
     {	 
    	boolean found = false;
      	int k = 0;
		while ((k < i)  && !found)
    	{
            if (Math.floorMod(j, s[k++]) == 0)
    		  found = true;
    	}
    	if (!found)
    	{	
          s[i] = j;
          i++;
    	}
    	j++;
     }		
   }
   
   void solve() throws IOException
   {
      int k = nextInt();
      s = new int[15000];
      get_simple(15000);
      for (int i = 0; i < k; i++)
      {	  
        int n = nextInt();
    	out.println(s[n - 1]);
      }  
   }

}