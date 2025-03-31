/*
class SharedResource 
{
  private int value = 0;
  public synchronized void increment() 
  {
      value++;
      System.out.println("Value incremented to: " + value);
  }
  public synchronized void decrement() 
  {
      value--;
      System.out.println("Value decremented to: " + value);
  }
}
class IncrementThread extends Thread 
{
  private SharedResource res;
  public IncrementThread(SharedResource res) 
  {
      this.res = res;
  }
  public void run() 
  {
      for(int i=0; i<5; i++) 
      {
          res.increment();
      }
  }
}
class DecrementThread extends Thread 
{
  private SharedResource res;
  public DecrementThread(SharedResource res) 
  {
      this.res = res;
  }
  public void run() 
  {
      for(int i=0; i<5; i++) 
      {
          res.decrement();
      }
  }
}
  public class Slip30 
  {
  public static void main(String args[]) 
  {
      SharedResource res = new SharedResource();

      IncrementThread Thread1 = new IncrementThread(res);
      DecrementThread Thread2 = new DecrementThread(res);

      Thread1.start();
      Thread2.start();
  }
}
*/


/*
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Slip30 extends JFrame
{
    private JTable table;
    public Slip30() 
    {
        super("Teacher Information");
        JPanel panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        JScrollPane scrollPane = new JScrollPane();
        panel.add(scrollPane, BorderLayout.CENTER);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Teacher ID", "Name", "Subject"});
        table = new JTable(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        scrollPane.setViewportView(table);
        try 
        {
          Class.forName("org.postgresql.Driver");
          Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32");
          Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
          ResultSet rs = stmt.executeQuery("SELECT * FROM Teacher");
          while (rs.next()) 
          {
                int no = rs.getInt("tno");
                String name = rs.getString("tname");
                String subject = rs.getString("subject");
                model.addRow(new Object[]{no, name, subject});
            }

        } 
        catch (SQLException | ClassNotFoundException e) 
        {
            System.out.println(e);
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Slip30();
    }
}
*/