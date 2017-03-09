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

   boolean is_arr(char[] r, char c)
   {
	   boolean res = false;
	   for (int i = 0; i< r.length; i++)
		   if (r[i] == c)
			   res = true;
	   return res;
   }
   
   void solve() throws IOException
   {
     String str = in.readLine();
     char[] r1 = {'a', 'd', 'g', 'j', 'm', 'p', 's', 'v', 'y', '.', ' '};
     char[] r2 = {'b', 'e', 'h', 'k', 'n', 'q', 't', 'w', 'z', ','};
     char[] r3 = {'c', 'f', 'i', 'l', 'o', 'r', 'u', 'x', '!'};
     
     int s = 0;
     for (int i = 0; i < str.length(); i++)
     {
    	 if (is_arr(r1, str.charAt(i))) s+=1;
    	 else if (is_arr(r2, str.charAt(i))) s+=2;
    	 else if (is_arr(r3, str.charAt(i))) s+=3;
     }
     out.print(s);

      
   }

}
