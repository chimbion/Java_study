import java.io.*;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

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
     
     int n = Integer.parseInt(str);
     int p1 = 0, p2 = 0, p3 = 0;
     for (int i=0; i < n; i++)
     {
    	 str = in.readLine();
    	 if (str.compareTo("Emperor Penguin") == 0) p1++;
    	 if (str.compareTo("Macaroni Penguin") == 0) p2++;
    	 if (str.compareTo("Little Penguin") == 0) p3++;

     }
     
     int maxp = Math.max(p1, Math.max(p2, p3));
     if (p1 == maxp)
       out.print("Emperor Penguin");
     if (p2 == maxp)
         out.print("Macaroni Penguin");
     if (p3 == maxp)
         out.print("Little Penguin");

      
   }

}
