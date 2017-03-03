import java.io.*;

public class problem1068 {

   public static void main(String[] args) throws IOException
   {
      new problem1068().run();
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
      int a = nextInt();
      long s = 0;
      for (int i = 1; i <= Math.abs(a); i++)
      {
    	  s+=i;
      }
      
      if (a < 0)
        s = -s;
      
      if (a < 1)
    	s++;
      
      out.println(s);
   }

}
