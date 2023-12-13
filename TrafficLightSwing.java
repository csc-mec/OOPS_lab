// Import necessary libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Define the class TrafficLightSwing that extends JFrame and implements ActionListener
public class TrafficLightSwing extends JFrame implements ActionListener {
    // Declare JRadioButton and JLabel components
    JRadioButton b1, b2, b3;
    JLabel l1, l2, l3;

    // Constructor for the TrafficLightSwing class
    public TrafficLightSwing() {
        // Initialize the JRadioButtons with respective colors
        b1 = new JRadioButton("Red");
        b2 = new JRadioButton("Yellow");
        b3 = new JRadioButton("Green");

        // Initialize the JLabels with respective instructions
        l1 = new JLabel("STOP");
        l2 = new JLabel("WAIT");
        l3 = new JLabel("GO");

        // Set the layout of the JFrame to FlowLayout
        setLayout(new FlowLayout());

        // Add the JLabels and JRadioButtons to the JFrame
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        add(b3);

        // Add action listeners to the JRadioButtons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    // Override the actionPerformed method from the ActionListener interface
    public void actionPerformed(ActionEvent ae) {
        // If the Red JRadioButton is selected
        if (ae.getSource() == b1) {
            // Set the STOP JLabel to opaque and its background color to red
            l1.setOpaque(true);
            l1.setBackground(Color.RED);

            // Set the background color of the other JLabels to white
            l2.setBackground(Color.WHITE);
            l3.setBackground(Color.WHITE);

            // Deselect the other JRadioButtons
            b2.setSelected(false);
            b3.setSelected(false);
        }

        // If the Yellow JRadioButton is selected
        if (ae.getSource() == b2) {
            // Set the WAIT JLabel to opaque and its background color to yellow
            l2.setOpaque(true);
            l2.setBackground(Color.YELLOW);

            // Set the background color of the other JLabels to white
            l1.setBackground(Color.WHITE);
            l3.setBackground(Color.WHITE);

            // Deselect the other JRadioButtons
            b1.setSelected(false);
            b3.setSelected(false);
        }

        // If the Green JRadioButton is selected
        if (ae.getSource() == b3) {
            // Set the GO JLabel to opaque and its background color to green
            l3.setOpaque(true);
            l3.setBackground(Color.GREEN);

            // Set the background color of the other JLabels to white
            l2.setBackground(Color.WHITE);
            l1.setBackground(Color.WHITE);

            // Deselect the other JRadioButtons
            b1.setSelected(false);
            b2.setSelected(false);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of TrafficLightSwing
        TrafficLightSwing t = new TrafficLightSwing();

        // Set the size of the JFrame
        t.setSize(500, 500);

        // Make the JFrame visible
        t.setVisible(true);

        // Set the default close operation for the JFrame
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
