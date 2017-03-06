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

   char invert_sign(char sign)
   {
	   char res;
	   if (sign == '+')
		   res = '-';
	   else
		   res = '+';
	   return res;
	   
   }
   String get_a(int n, int s, char sign)
   {
	   String res = "";
	   if (s == n)
	     res = "sin(" + n + ")";
	   else
	   {
		   res = "sin(" + s + sign + get_a(n, s + 1, invert_sign(sign)) + ')';
	   }
	   return res;
   }
   void solve() throws IOException
   {
      int n = nextInt();
    
      StringBuilder S = new StringBuilder("");
      int j = n;
      for (int i = 1; i <= n; i ++)
      {
    	 if (S.length() > 0)
    	 {
    		 S.insert(0, "(");
    		 S.append(")");
    	 }
    	 S.append(get_a(i, 1, '-') + "+" + j--);
      }
      out.print(S);
   }
}