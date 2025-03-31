/*
package Java_Slips.slip13;
import java.sql.*;

public class metaData {

    public static void main(String[] args) 
    {
        try 
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/darshan","root","1234");
            DatabaseMetaData metaData = connection.getMetaData();

            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());

            ResultSet tables = metaData.getTables(null, null, null, new String[]{"TABLE"});
            System.out.println("\nTables in the database:");
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println(tableName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/

/*
package Java_Slips.slip13;

import java.util.*;

public class ThreadLC extends Thread {
    private String threadName;

    public ThreadLC(String name) {
        threadName = name;
    }
    
    public void run() {
        Random random = new Random();
        int sleepTime = random.nextInt(5000); // Generate a random sleep time between 0 and 4999 milliseconds
        try {
            System.out.println("Thread " + threadName + " is created.");
            System.out.println("Thread " + threadName + " will sleep for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime);
            System.out.println("Thread " + threadName + " is dead.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadLC thread1 = new ThreadLC("Thread1");
        ThreadLC thread2 = new ThreadLC("Thread2");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

*/