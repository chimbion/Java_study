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

   String get_a(int n)
   {
	   String res = "";
	   if (n == 1) 
	     res = "sin(1)";
	   else
	   {
		   char sign = '+';
		   StringBuilder A = new StringBuilder("sin(" + n + ")"); 
		   for (int i = n; i > 1; i--)
		   {
			   A.append((n - 1)+ " ");
		   }
	   }
	   return res;
   }
   void solve() throws IOException
   {
      int n = nextInt();
      //StringBuilder A = "", S = "";
      
      for (int i = n; i > 0; i--)
      {
//        S = 
//        A = 
      }
//      ѕусть An = sin(1Цsin(2+sin(3Цsin(4+Еsin(n))Е)
//     ќбозначим Sn = (Е(A1+n)A2+nЦ1)A3+Е+2)An+1
//      ((sin(1)+3)sin(1Цsin(2))+2)sin(1Цsin(2+sin(3)))+1
      
      //out.print(S);
   }
//   sin(1)
//   sin(1Цsin(2))
//   sin(1Цsin(2+sin(3)))
}