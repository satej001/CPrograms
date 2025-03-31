/* 
import java.util.*;
public class Slip21 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.print("\nEnter the number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) 
        {
            System.out.print("Enter subject " + (i+1) + ": ");
            list.add(sc.nextLine());
        }

        System.out.println("\nList items:-");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
*/


/*
class shop
{
      int material;
      boolean flag = false;
      public synchronized int get()
      {
             while (flag == false)
             {
                    try
                    {
                        wait();
                    }
                    catch (Exception e)
                    {
                           e.getStackTrace();
                    }
             }
             flag = false;
             notify();
             return material;
      }      
      public synchronized void put(int value)
      {
             while (flag == true)
             {
                    try
                    {
                        wait();
                    }
                    catch (Exception e)
                    {
                           e.getStackTrace();
                    }
             }
             material = value;
             flag = true;
             notify();
      }
}
class Consumer extends Thread
{
      shop sh;
      int no;      
      public Consumer(shop shp, int no)
      {
             sh = shp;
             this.no = no;
      }
      public void run()
      {      
             try
             {
                 sleep(1000);
             }
             catch(Exception e)
             {
                   e.printStackTrace();
             }
             int value = 0;
             for (int i=0;i<10;i++)
             {
                 value = sh.get();
                 System.out.println("Consumer #"+this.no+" got : "+value);
             }
      }
}
class Producer extends Thread
{
      shop sh;
      int no;
      
      public Producer(shop s, int no)
      {
             sh = s;
             this.no = no;
      }
      public void run()
      {
             for (int i=0;i<10;i++)
             {
                 sh.put(i);
                 System.out.println("Producer #"+this.no+" put : "+i);
                 try
                 {
                     sleep(1000);
                 }
                 catch (Exception e)
                 {
                        e.getStackTrace();
                 }
             }
      }
}
public class Slip21
{
       public static void main(String[] args)
       {
              shop s = new shop();
              Producer p = new Producer(s,1);
              Consumer c = new Consumer(s,1);
              
              
              p.start();
              c.start();
              
       }
}
*/