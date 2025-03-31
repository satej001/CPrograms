/*
package Java_Slips.slip18;

public class ThreadPriority extends Thread { 
    public void run()
     { 
     System.out.println("running thread name is:"+Thread.currentThread().getName()); 
     System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
     } 
    public static void main(String args[])
    { 
        ThreadPriority m1=new ThreadPriority(); 
        ThreadPriority m2=new ThreadPriority(); 
        m1.setPriority(Thread.MIN_PRIORITY); 
        m2.setPriority(Thread.MAX_PRIORITY); 
        m1.start(); 
        m2.start(); 
    } 
    }
*/


/*
<!DOCTYPE html>
<html>
<head>
    <title>Student Details Form</title>
</head>
<body>
    <h2>Enter Student Details</h2>
    <form action="Student" method="post">
        Seat No: <input type="text" name="seatNo"><br>
        Name: <input type="text" name="studentName"><br>
        Class: <input type="text" name="studentClass"><br>
        Total Marks: <input type="text" name="totalMarks"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

package Java_Slips.slip18;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Student extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Retrieve student details from the request
        int seatNo = Integer.parseInt(request.getParameter("seatNo"));
        String studentName = request.getParameter("studentName");
        String studentClass = request.getParameter("studentClass");
        int totalMarks = Integer.parseInt(request.getParameter("totalMarks"));
        
        // Calculate percentage
        double percentage = (totalMarks / 500.0) * 100;
        
        // Calculate grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        
        // Prepare HTML response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Student Details</title></head><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<table border=\"1\"><tr><th>Seat No</th><th>Name</th><th>Class</th><th>Total Marks</th><th>Percentage</th><th>Grade</th></tr>");
        out.println("<tr><td>" + seatNo + "</td><td>" + studentName + "</td><td>" + studentClass + "</td><td>" + totalMarks + "</td><td>" + percentage + "%</td><td>" + grade + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}*/