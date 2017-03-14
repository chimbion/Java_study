import java.io.*;

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
      int qxx = nextInt();
      int zzz = nextInt();
      int sum = 0;
      for (int i = 0; i < 10; i++)
       sum += nextInt();	  
      
      if (zzz - sum * 20 >= qxx)
    	  out.print("No chance.");
      else
    	  out.print("Dirty debug :(");
   }

}