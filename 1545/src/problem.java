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
     String[] signs = new String[n];

     for (int i=0; i < n; i++)
     {
       str = in.readLine();
       signs[i] = str;
     }
     
     str = in.readLine();
     
     for (int i = 0; i < n; i++)
     {	 
       if (signs[i].startsWith(str))
         out.println(signs[i]);
     }
      
   }

}
