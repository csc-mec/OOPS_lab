import javax.swing.*;

class SwingDemo
{
    SwingDemo()
    {
        JFrame jfrm  = new JFrame("A Simple Swing Application");
        jfrm.setSize(500,500);
        JLabel jlab = new JLabel("Swing is used to implement GUI's");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }
    public static void main(String args[])
    {
       SwingDemo obj = new SwingDemo();
    }
}