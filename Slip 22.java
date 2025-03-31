/*
import java.sql.*;
import java.util.Scanner;
public class Slip22
{
    private static void insert(Connection conn) throws SQLException 
    {
        String sql = "insert into emp2 values (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eno:");
        ps.setInt(1, sc.nextInt());
        sc.nextLine();

        System.out.println("Enter ename:");
        ps.setString(2, sc.nextLine());

        System.out.println("Enter salary:");
        ps.setFloat(3, sc.nextFloat());
        
        ps.executeUpdate();
    }
    private static void update(Connection conn) throws SQLException 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter eno:");
      int eno = sc.nextInt();
      sc.nextLine();
        
      System.out.println("Enter new  ename:");
      String ename = sc.nextLine();
        
      System.out.println("Enter new salary:");
      float salary = sc.nextFloat();
        
      String sql = "update emp2 set ename = '" + ename + "', salary = " + salary + " where eno = " + eno;
      Statement stmt = conn.createStatement();
      stmt.executeUpdate(sql);
    }
    private static void display(Connection conn) throws SQLException 
    {

      String sql = "select * from emp2";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);

      System.out.println("Emp table data:");
      while (rs.next()) 
      {
        System.out.println("eno: " + rs.getInt("eno"));
        System.out.println("ename: " + rs.getString("ename"));
        System.out.println("salary: " + rs.getFloat("salary"));
      }
    }
    public static void main(String[] args) throws SQLException 
    {
        Scanner sc = new Scanner(System.in);
        Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","ty32");

        int ch;
        do 
        {
            System.out.println("Menu");
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("-------------------------");

            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch (ch) 
            {
                case 1:
                    insert(conn);
                    break;
                case 2:
                    update(conn);
                    break;
                case 3:
                    display(conn);
                        break;
            }
        } while (ch != 4);
    }
}
*/

/*
JSP File :-
<html>
<body>
<%
      String name=request.getParameter("username");
      java.util.Date d=new java.util.Date();
      int hr=d.getHours();
      if(hr<12)
      {
        out.println("Good Morning:"+name);
      }   
      if(hr>12 && hr<16)
      {
        out.println("Good Afternoon:"+name);
      }
      if(hr>16)
      {
          out.println("Good Evening:"+name);
      }
%>
</body>
</html>

HTML file :-
<html>
<body>
<form action="wishuser.jsp" method="post">
<input type="text" name="username">
<input type="submit">
</form>
</body>
</html>

*/