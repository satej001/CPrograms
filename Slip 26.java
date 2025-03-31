/*
import java.sql.*;
public class Slip26 
{
    public static void main(String args[]) 
    {
        int empId = Integer.parseInt(args[0]);
        try 
        {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ty92","ty32","ty");

            PreparedStatement pstmt = con.prepareStatement("DELETE FROM Employee WHERE eno = ?");
            pstmt.setInt(1, empId);

            int rowAffected = pstmt.executeUpdate();

            if(rowAffected > 0)
                System.out.println("\nDetails of employee with ID " + empId + " deleted successfully!");
            else
                System.out.println("Employee with ID " + empId + " not found.");
        } catch(SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
*/

/*

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sum of first and last digit</title>
</head>
<body>
    <h2>Calculate Sum of First and Last Digits</h2>
    <form action="" method="post">
        Enter a number: <input type="text" name="number"><br>
        <input type="submit" value="Calculate">
    </form>

    <% 
        String numberStr = request.getParameter("number");
        if(numberStr != null && !numberStr.isEmpty()) 
        {
            int number = Integer.parseInt(numberStr);
            int firstDigit = Character.getNumericValue(numberStr.charAt(0));
            int lastDigit = number % 10;
            int sum = firstDigit + lastDigit;
    %>
    <p style="color: red; font-size: 18px;">Sum of first and last digit of <%= number %>: <%= sum %></p>
    <% } %>
</body>
</html>
*/