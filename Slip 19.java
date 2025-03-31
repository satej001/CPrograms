/*
package Java_Slips.slip19;

import java.util.*;

public class LinkedListw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the value of N
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();

        // Create a LinkedList to store integers
        LinkedList<Integer> list = new LinkedList<>();

        // Accept N integers from the user and add them to the list
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        // Display only the negative integers
        System.out.println("Negative Integers:");
        for (int num : list) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
*/


/*


<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login Form</h2>
    <form action="LoginServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        <input type="submit" value="Login">
    </form>
</body>
</html>



import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip19 extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        boolean isValidUser = validateUser(username,password);

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        if(isValidUser) 
        {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } 
        else 
        {
            out.println("<h2>Invalid username or password!</h2>");
        }
        out.println("</body></html>");
    }
    private boolean validateUser(String username, String password) 
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ty92","ty92","ty92");

            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Users WHERE username=? AND password=?");

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next())
                return true;

            rs.close();
            pstmt.close();
            con.close();

        } 
        catch (SQLException | ClassNotFoundException e) 
        {
            System.out.println(e);
        }
        return false;
    }
}
*/