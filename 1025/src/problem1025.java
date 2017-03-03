import java.io.*;

public class problem1025 {

   public static void main(String[] args) throws IOException
   {
      new problem1025().run();
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
      int[] num = new int[a];
      for (int i = 0; i < a; i ++)
        num[i] = nextInt();
      boolean b = true;
      while (b)
      {
    	  b = false;
    	  for (int i = 0; i < a - 1; i ++)
           if (num[i] > num[i+1])
           {
        	   int t = num[i+1];
        	   num[i+1] = num[i];
        	   num[i] = t;
        	   b = true;
           }
      }
      int res = 0;
      for (int i = 0; i < (int)Math.floor(a/2) + 1; i++)
        res = res + (int)Math.floor(num[i]/2) + 1;
      out.println(res);
   }  
}
