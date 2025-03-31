/*
import java.io.*;
public class Slip08 extends Thread
{ 
	String str;
	int n;
	Slip08(String str,int n)
	{ 
	   this.str=str;
	   this.n=n;
	}	
	public void run()
	{
	   try
	   {
              for (int i=0;i<n;i++)
              {
                 System.out.println(getName()+" : "+i+" : "+str);
	      }
	   }
	   catch(Exception e)
	   {
	     e.printStackTrace();
	   }
	}
	public static void main(String args[])
	{
	    Slip08 t1=new Slip08("COVID19",10);
	    Slip08 t2=new Slip08("LOCKDOWN2020",20);
	    Slip08 t3=new Slip08("VACCINATED2021",30);
	     
	    t1.start();
	    t2.start();
	    t3.start();
	}
}
*/

/*
 save as prim.html
<html>
<body>
<h1>Check Prime Number</h1>
<form action="prime.jsp" method="post">
Enter A Number : <input type="text" name="t1" width=50>
<input type="Submit" value="Check Prime">
</form>
</body>
</html>


save as prime.jsp
<html>
<head>
<title>
	Check Prime
</title>
</head>
<body>
<%
	int n=Integer.parseInt(request.getParameter("t1"));
	int i;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
			break;
	}
	if(i==n)
		out.println("<h1 style='color:red'>Number is Prime</h1>");
	else
		out.println("<h1 style='color:green'>Number is Not Prime</h1>");
%>
<hr>
<br>
<a href="index.html">Home</a>
</body>
</html>

*/
