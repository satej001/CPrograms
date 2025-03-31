/*
import java.sql.*;
public class Slip29
{       
  public static void main(String[] args)
  {
    try (Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","ty32"))
    {
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM DONOR");
                  
      ResultSetMetaData metaData = rs.getMetaData();
                  
      int columnCount = metaData.getColumnCount();
      System.out.println("Number of Columns: "+columnCount);
                  
      int i;
      for (i=1;i<=columnCount;i++)
      {
        System.out.println("Column Name : "+metaData.getColumnName(i));
        System.out.println("Column Type : "+metaData.getColumnTypeName(i));
        System.out.println("Column Size : "+metaData.getColumnDisplaySize(i));
        System.out.println("Is Nullable : "+metaData.isNullable(i));
        System.out.println();
      }
      rs.close();
      stmt.close();
      conn.close();
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }
}
*/


/*
import java.util.*;
public class Slip29
{
    public static void main(String[] args) 
    {
      List<Integer> l = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      
      int ch; 
      do 
      {
        System.out.println("Menu");
        System.out.println("1. Add elements at first position :");
        System.out.println("2. Delete last element");
        System.out.println("3. Display size of linklist");
        System.out.println("4. Exit");
            
        System.out.println("------------------------------");
        System.out.println("Enter your choice:");
        ch = sc.nextInt();
        System.out.println();
            
        switch(ch)
        {
          case 1: System.out.println("Enter a number:");
                    l.addFirst(sc.nextInt());
                    break;
          case 2: l.removeLast();
                    break;
          case 3: System.out.println("Size : " + l.size() + "\n" + l);
                    break;
                default: System.out.println("Exit Successfully");
            }
            System.out.println("-------------------------------");
        } while(ch != 4);
    }
}
*/
