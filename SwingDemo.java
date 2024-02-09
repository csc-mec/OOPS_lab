import javax.swing.*;

class SwingDemo
{
    SwingDemo()
    {
        JFrame jfrm  = new JFrame("A Simple Swing Application");
        jfrm.setSize(200,200);
        JLabel jlab = new JLabel("Swing is used to implement GUI's");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new
        Runnable() {
        public void run() {
        new SwingDemo();
            }
        });
    }
}