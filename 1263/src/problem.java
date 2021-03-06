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
     int m = nextInt();
     int[]a = new int[n];
    		 
    for (int i =0; i<n; i++)
    	a[i] = 0;
     
     for (int i = 0; i<m; i++)
     {
    	 int m1 = nextInt();
    	 a[m1-1]++;
     }
     
     int s = 0;
     for (int i =0; i < n; i++)
     	s += a[i];
      
     double f1 = 0.0;
     for (int i = 0; i < n; i++)
     {	 
      	 double f2 = (double)Math.round((double)a[i]/s *100 * 100) / 100;
      	 f1 += f2;		 
    	 out.printf("%.2f",f2);
    	 out.println("%");
     }
     //out.printf("%.2f", (double)Math.round((100.00-f1) * 100) / 100);
	 //out.println("%");

   }
}


