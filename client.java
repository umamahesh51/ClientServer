import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
	 public static void main(String args[])throws UnknownHostException,IOException
	 {
		  Socket s=new Socket("127.0.0.1",5555);
		  Scanner s1=new Scanner(System.in);
		  Scanner s2=new Scanner(s.getInputStream());
		  System.out.println("--------CLIENT-------");
		  System.out.println("start conversation :)");
		   String temp="",x="";
		  do
		  {//System.out.print(">>");
		   x=s1.nextLine();
		  PrintStream p=new PrintStream(s.getOutputStream());
		  p.println(x);
		  temp=s2.nextLine();
		  System.out.println("\t"+temp);
		  }while(!temp.equals("byee") && !x.equals("byee") );
			  
	 }
 }