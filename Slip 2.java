/*
import java.util.*;
public class Slip02 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter total number of friends: ");
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> friendsSet = new HashSet<String>();

        for(int i=0; i<n; i++) 
        {
            System.out.print("\nEnter the name of friend " + (i+1) + ": ");
            String name = sc.nextLine();
            friendsSet.add(name);
        }
        ArrayList<String> sortedFriendsList = new ArrayList<String>(friendsSet);
        Collections.sort(sortedFriendsList);
        System.out.println("\n Sorted friend's list in ascending order:");
        for(String friend : sortedFriendsList) 
            System.out.println(friend);
        sc.close();
    }
}
*/

/*
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip02 extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");
        String serverInfo = getServletContext().getServerInfo();
        Collection<? extends ServletRegistration> servletRegistrations = getServletContext().getServletRegistrations().values();

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet Information</title></head>");
        out.println("<body>");
        out.println("<h2>Server Information:</h2>");
        out.println("<p>Server Software: " + serverInfo +"</p>");
        out.println("<h2>Loaded Servlets:</h2>");
        for (ServletRegistration servletRegistration : servletRegistrations) 
        {
            out.println("<p>" + servletRegistration.getName() +"</p>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
*/