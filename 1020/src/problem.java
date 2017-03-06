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

   double nextDouble() throws IOException
   {
      in.nextToken();
      return (double)in.nval;
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

   double get_len(double r, double x1, double y1, double x2, double y2)
   {
	 double res = 0.0;
	 res = Math.sqrt(Math.abs(x2 - x1) * Math.abs(x2 - x1) + Math.abs(y2 - y1) * Math.abs(y2 - y1));
	 return res;
   }
   
   void solve() throws IOException
   {
      int n = nextInt();
      double r = nextDouble();
      double x1 = nextDouble();
      double y1 = nextDouble();
      double xn = x1;
      double yn = y1;
      double p = 0.0;
      
      for (int i = 1; i < n; i++)
      {
          double xc = nextDouble();
          double yc = nextDouble();
          p += get_len(r, xn, yn, xc, yc);
          xn = xc;
          yn = yc;
      }
      p += get_len(r, xn, yn, x1, y1);
      p += 2 * Math.PI * r;
      
      out.printf("%.2f", p);
    		  
   }

}
