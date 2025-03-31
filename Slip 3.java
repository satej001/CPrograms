/*
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Patient Details</title>
</head>
<body>
    <h1>Patient Details</h1>
    <table border="1">
        <tr>
            <th>Patient Number</th>
            <th>Patient Name</th>
            <th>Patient Address</th>
            <th>Patient Age</th>
            <th>Patient Disease</th>
        </tr>
        <%@ page import="java.sql.*" %>
        <% 
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try
            { 
                String url = "jdbc:postgresql://192.168.1.254:5432/ty35";
                String username = "ty35";
                String password = "ty35";

                conn = DriverManager.getConnection(url, username, password);
                String sql = "SELECT * FROM patien";
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                while (rs.next()) 
                {
        %><tr>
            <td><%= rs.getString("pno") %></td>
            <td><%= rs.getString("pname") %></td>
            <td><%= rs.getString("paddr") %></td>
            <td><%= rs.getString("age") %></td>
            <td><%= rs.getString("disease") %></td>
            </tr>
        <%
        }
    } 
    catch (Exception e) 
    {
        e.printStackTrace();
    } 
    finally 
    {
      try 
      {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } 
        catch (SQLException e) 
        {
           e.printStackTrace();
        }
    }
    %>
</table>
</body>
</html>
*/


/* 
import java.util.LinkedList;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean continueOperations = true;
        
        while (continueOperations) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add element at the end of the list");
            System.out.println("2. Delete first element of the list");
            System.out.println("3. Display the contents of list in reverse order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.nextLine();
                    linkedList.add(elementToAdd);
                    break;
                    
                case 2:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFirst();
                        System.out.println("First element deleted successfully.");
                    } else {
                        System.out.println("List is empty. Cannot delete.");
                    }
                    break;
                    
                case 3:
                    if (!linkedList.isEmpty()) {
                        System.out.println("List in reverse order:");
                        for (int i = linkedList.size() - 1; i >= 0; i--) {
                            System.out.println(linkedList.get(i));
                        }
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                    
                case 4:
                    continueOperations = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        
        System.out.println("Exiting the program.");
        scanner.close();
    }
}

*/