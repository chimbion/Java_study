import java.awt.List;
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

   class cmd
   {
	   String name;
	   int cnt;
	   cmd(String name)
	   {
		   this.name = name;
		   cnt = 1;
	   }
   }
   
   void solve() throws IOException
   {
      int n = Integer.parseInt(in.readLine());
      ArrayList<cmd> cmds = new ArrayList<>();
      
      for (int i = 0; i < n; i++)
      {
    	  String str = in.readLine();
    	  boolean found = false;
    	  for (int j = 0; j < cmds.size(); j++)
    	  {
    		  if (cmds.get(j).name.equals(str))
    		  {	  
    			  cmds.get(j).cnt++;
    			  found = true;
    		  }	  
    	  }
    	  if (!found)
    		  cmds.add(new cmd(str));
      }
      
      for (int i = 0; i < cmds.size(); i++)
    	  if (cmds.get(i).cnt > 1) 
    	    out.println(cmds.get(i).name);
    }
      
}


