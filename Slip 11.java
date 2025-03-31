/*
save as searchS.html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Search</title>
</head>
<body>
    <h1>Customer Search</h1>
    <form id="searchForm" action="cust" method="post">
        <label for="customerNumber">Enter Customer Number:</label><br>
        <input type="text" id="customerNumber" name="customerNumber"><br><br>
        <button type="submit">Search</button>
    </form>

    <div id="searchResults">
        <!-- Search results will be displayed here -->
    </div>

</body>
</html>




import java.io.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class cust extends HttpServlet {
    
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:postgresql://192.168.1.254:5432/ty6";
    private static final String JDBC_USER = "ty6";
    private static final String JDBC_PASSWORD = "ty6";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve customer number from the request
        String customerNumber = request.getParameter("customerNumber");

        // Database connection
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;setCookie

        try {
            // Register JDBC driver
            //Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Open a connection
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            
            // Prepare SQL statement to retrieve customer details based on customer number
            String sql = "SELECT * FROM customer WHERE cno = ?";
            pstmt = conn.prepareStatement(sql);
            int c=Integer.parseInt(customerNumber);
            pstmt.setInt(1, c);
            setCookie
            // Execute the query
            rs = pstmt.executeQuery();

            if (rs.next()) {
                // If customer details found, retrieve them
                int customerNo = rs.getInt("cno");
                String customerName = rs.getString("cname");
                String customerCity = rs.getString("city");
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h2>Customer Details</h2>");
                out.println("<p>" + customerNo + "</p>");
                out.println("<p>" + customerName + "</p>");
                out.println("<p>" + customerCity + "</p>");
                
            } else {
                // If customer details not found, return an error message
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h2>Error</h2>");
                out.println("<p>Customer not found.</p>");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle errors appropriately
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle errors appropriately
            }
        }
    }
}

//save this file in classes folder
//in web.xml add
/*
<web-app>

<servlet>
<servlet-name>cust</servlet-name>
<servlet-class>cust</servlet-class>
</servlet>
<servlet-mapping>
 <servlet-name>cust</servlet-name>
 <url-pattern>/cust/*</url-pattern>
</servlet-mapping>

</web-app>
 */

/*
import java.sql.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Slip11
{
    public static void main(String[] args)throws SQLException 
    {
        Connection con;
        Statement stmt;
        ResultSet rs;

        try 
        {
            // Registering the MySQL JDBC Driver
            Class.forName("com.postgresql.Driver");

            con = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32");
            if (con==null)
            {
                System.out.println("Connection failed..");
            }
            else
            {
                stmt=con.createStatement();
                rs=stmt.executeQuery("Select * from Donor");

                ResultSetMetaData rsmd=rs.getMetaData();
                int no=rsmd.getColumnCount();

                for (int i=0;i<no;++i){
                    System.out.println("Column no : "+i);
                    System.out.println("Column name : "+rsmd.getColumnName(i));
                    System.out.println("Column type : "+rsmd.getColumnType(i));
                    System.out.println("Column Display size : "+rsmd.getColumnDisplaySize(i));
               }
                con.close();
            }
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
        }
    }   
}
*/