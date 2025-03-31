/*
import java.util.Random;
class Square extends Thread 
{
	int x;
	int sqr;
	Square(int n)
	{
	    x = n;
	}
	public void run() 
	{
	    sqr = x * x;
	}
}
class Cube extends Thread 
{
	int x;
	Cube(int n) 
	{
	    x = n;
	}
	public void run() 
	{
		int cub = x * x * x;
		System.out.println("Cube of " + x + " = " + cub);
	}
}
class Number extends Thread 
{
	public void run() 
	{
		Random random = new Random();
		for (int i = 0; i < 10; i++)
		 {
			int ri = random.nextInt(100);
			System.out.println("Random Integer generated : " + ri);
			if(ri%2==0)
			{
			    System.out.println(" Random number : "+ ri + "  is even ");
			    Square s = new Square(ri);
		    	s.start();
		    	System.out.println("Square of " + ri + " = " + ri*ri);
			}
			else
			{
			     System.out.println(" Random number : "+ri+ "  is odd");
			    Cube c = new Cube(ri);
		    	c.start();
			}
			try 
			{
				Thread.sleep(100);
			} catch (InterruptedException ex) 
			{
				System.out.println(ex);
			}
		}
	}
}
public class Slip07 
{
	public static void main(String args[]) 
	{
		Number n = new Number();
		n.start();
	}
}
*/


/* 
import java.sql.*;
public class Slip07
{
    public static void main(String args[]) 
		{
        try 
				{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32");
            Statement stmt = con.createStatement();

            stmt.execute("CREATE TABLE IF NOT EXISTS Product(PID int primary key, PNAME varchar(20), PRICE int)");
            System.out.println("Table created successfully!");

            insertRecords(stmt);
            displayRecords(stmt);
            stmt.close();
        } catch (SQLException | ClassNotFoundException e) 
				{
            System.out.println(e);
        }
    }

    private static void insertRecords(Statement stmt) throws SQLException 
		{
        String insertSQL = "INSERT INTO Product (PID, PNAME, PRICE) VALUES ";
        String records[] = {
            "(1, 'A', 12)",
            "(2, 'B', 32)",
            "(3, 'C', 24)",
            "(4, 'D', 14)",
            "(5, 'E', 10)"
      };

      for(String record : records)
          stmt.executeUpdate(insertSQL + record);

        System.out.println("\n Records inserted into product table successfully!");
    }

    private static void displayRecords(Statement stmt) throws SQLException 
		{
        ResultSet rs = stmt.executeQuery("SELECT * FROM Product");

        System.out.println("\n- Records from Product Table -\n");
        System.out.println("\nPID\tPNAME\tPRICE");

        while(rs.next()) {
            int pid = rs.getInt("PID");
            String pname = rs.getString("PNAME");
            int price = rs.getInt("PRICE");
            System.out.println(pid + "\t" + pname + "\t" + price);
        }

        rs.close();
    }
}
*/