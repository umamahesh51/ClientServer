import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
	 public static void main(String args[])throws UnknownHostException,IOException
	 {     
	      ServerSocket ss=new ServerSocket(5555);
		  Socket s=ss.accept();
          Scanner s1=new Scanner(System.in);
		  Scanner s2=new Scanner(s.getInputStream());
		  System.out.println("--------SERVER-------");
		  System.out.println("start conversation :)");
		  String temp="",x="";
		do{ 
    	   x=s2.nextLine();
		  System.out.println("\t"+x);
		   temp=s1.nextLine();
		  PrintStream p=new PrintStream(s.getOutputStream());
		  p.println(temp);
		  } while(!temp.equals("byee") && !x.equals("byee") );
     }
}
