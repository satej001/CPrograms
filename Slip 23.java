/*
import java.util.*;
class VowelThread extends Thread 
{
    private String inputString;

    public VowelThread(String inputString) 
    {
        this.inputString = inputString;
    }
    public void run() 
    {
        try 
        {
            for(int i=0; i<inputString.length(); i++) 
            {
                char ch = inputString.charAt(i);
                if(isVowel(ch)) 
                {
                    System.out.println(ch);
                    Thread.sleep(3000);
                }
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }
    private boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
public class Slip23 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String inputString = sc.nextLine();

        VowelThread thread = new VowelThread(inputString);
        thread.start();
        sc.close();
    }
}
*/


/* 
import java.util.*;
public class Slip23 
{
    public static void main(String[] args) 
    {   
        if (args.length == 0) 
        {
            System.out.println("No student names provided. Please provide names as command line arguments.");
            return;
        }
        ArrayList<String> studentNamesList = new ArrayList<>();
        for (String arg : args) {
            studentNamesList.add(arg);
        }
        System.out.println("Student Names (using Iterator):");
        Iterator<String> iterator = studentNamesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nStudent Names (using ListIterator in reverse order):");
        ListIterator<String> listIterator = studentNamesList.listIterator(studentNamesList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
*/