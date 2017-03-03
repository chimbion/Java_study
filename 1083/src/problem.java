import java.io.*;
import java.util.*;

public class problem {

   public static void main(String[] args) throws IOException
   {
      new problem().run();
   }

   BufferedReader in;
   PrintWriter out;

   void run() throws IOException
   {
	  boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	  Reader reader = oj ? new InputStreamReader(System.in) : new FileReader("input.txt");
	  Writer writer = oj ? new OutputStreamWriter(System.out) : new FileWriter("output.txt");
	  in = new BufferedReader(reader);
	  out = new PrintWriter(writer);
	  solve();
      out.flush();
   }

   void solve() throws IOException
   {
     String str = in.readLine();
     StringTokenizer st = new StringTokenizer(str, " ");
     
     
     int n = Integer.parseInt(st.nextToken());
     int k = st.nextToken().length();
       
     int mod = Math.floorMod(n, k);
     if (mod == 0) mod = 1;
     
     long res = n;
     int cur = k;
     
     while (n - cur >= mod)
     {
    	 res *= (n - cur);
    	 cur += k;
     }
     
     out.println(res);
      
   }

}
