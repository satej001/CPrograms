/*
import java.util.Scanner;
import java.util.TreeSet;

public class unicInt 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        TreeSet<Integer> uniqueIntegers = new TreeSet<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) 
            uniqueIntegers.add(scanner.nextInt());
       
        System.out.println("\nIntegers in sorted order (without duplicates):");
        for (int integer : uniqueIntegers) 
            System.out.println(integer);
            
    }
}
*/

/* 
package Java_Slips.slip17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberDisplay extends JFrame {
    private JTextField textField;
    private JButton startButton;
    private volatile boolean running;

    public NumberDisplay() {
        setTitle("Number Display");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        add(textField);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    running = true;
                    startButton.setEnabled(false);
                    startDisplayingNumbers();
                }
            }
        });
        add(startButton);
    }

    private void startDisplayingNumbers() {
        Runnable numberRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100 && running; i++) {
                    final int number = i;
                    SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                            textField.setText(Integer.toString(number));
                        }
                    });

                    try 
                    {
                        Thread.sleep(1000); // Sleep for 1 second
                    } 
                    catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                running = false;
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        startButton.setEnabled(true);
                    }
                });
            }
        };

        Thread numberThread = new Thread(numberRunnable);
        numberThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberDisplay().setVisible(true);
            }
        });
    }
}

*/
