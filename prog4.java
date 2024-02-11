import java.awt.event.*;
import javax.swing.*;

public class prog4 implements ActionListener 
{
    JFrame f;
    JTextField tf;
    JButton b;
    JLabel l;
    static int n;

    prog4() 
    {
        f = new JFrame("GUI for Threading");
        f.setSize(500, 500);
        f.setLayout(null);

        tf = new JTextField();
        tf.setBounds(170, 50, 150, 50);

        b = new JButton("Print");
        b.setBounds(150, 200, 150, 50);
        b.addActionListener(this);

        l = new JLabel("Enter the value of n:");
        l.setBounds(30, 50, 150, 50);

        f.add(tf);
        f.add(b);
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == b) 
        {
            n = Integer.parseInt(tf.getText());
            printThread(n);
        }
    }

    public static class ThreadGenerator implements Runnable 
    {
        int n;
        String message;

        public ThreadGenerator(int n, String message) 
        {
            this.n = n;
            this.message = message;
        }

        public void run() 
        {
            for (int i = 0; i < n; i++) 
            {
                synchronized (System.out) // here we are synchronizing the output stream
                {
                    System.out.println(message);
                }
            }
        }
    }

    public void printThread(int n) 
    {
        ThreadGenerator th1 = new ThreadGenerator(n, "Thrikkakara");
        ThreadGenerator th2 = new ThreadGenerator(n,"Kochi");

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);

        t1.start();
        t2.start();
    }

    public static void main(String[] args) 
    {
        new prog4(); 
    }
}
