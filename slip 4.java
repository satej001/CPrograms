/*
import java.awt.*;
import java.awt.event.*;
class Slip04 extends Frame implements Runnable
{
    Thread t;
    Label l1;
    int f;
    Slip04()
    {
        t=new Thread(this);
        t.start();
        setLayout(null);
        l1=new Label("Hello JAVA");
        l1.setBounds(100,100,100,40);
        add(l1);
        setSize(300,300);
        setVisible(true);
        f=0;
    }
    public void run()
    {
    try
        {
          if(f==0)
          {
              t.sleep(200);
              l1.setText("");
              f=1;
          }
          if(f==1)
          {
              t.sleep(200);
              l1.setText("Hello Java");
              f=0;
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        run();
    }
    public static void main(String a[])
    {
      new Slip04();
    }
}
*/


/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Map<String, String> cityCodes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean continueOperations = true;
        
        while (continueOperations) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add a new city and its code");
            System.out.println("2. Remove a city from the collection");
            System.out.println("3. Search for a city name and display the code");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the city name: ");
                    String cityName = scanner.nextLine();
                    System.out.print("Enter the STD code: ");
                    String stdCode = scanner.nextLine();
                    if (!cityCodes.containsKey(cityName)) {
                        cityCodes.put(cityName, stdCode);
                        System.out.println("City and STD code added successfully.");
                    } else {
                        System.out.println("City already exists. Cannot add duplicate.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter the city name to remove: ");
                    String cityToRemove = scanner.nextLine();
                    if (cityCodes.containsKey(cityToRemove)) {
                        cityCodes.remove(cityToRemove);
                        System.out.println("City removed successfully.");
                    } else {
                        System.out.println("City not found. Cannot remove.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter the city name to search: ");
                    String cityToSearch = scanner.nextLine();
                    if (cityCodes.containsKey(cityToSearch)) {
                        System.out.println("STD code for " + cityToSearch + ": " + cityCodes.get(cityToSearch));
                    } else {
                        System.out.println("City not found.");
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
}*/

