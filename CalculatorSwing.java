import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame {
    // Declare components. These are the elements that will be displayed on the window.
    JTextField t1, t2, t3; // Text fields for user input and displaying the result
    JButton b1, b2, b3, b4; // Buttons for performing calculations
    JLabel l1, l2, l3; // Labels to identify the text fields

    public CalculatorSwing() {
        // Initialize components. This is where we create the actual objects.
        t1 = new JTextField(10); // Text field for the first number, with a width of 10 columns
        t2 = new JTextField(10); // Text field for the second number
        t3 = new JTextField(10); // Text field for the result
        b1 = new JButton("+"); // Button for addition
        b2 = new JButton("-"); // Button for subtraction
        b3 = new JButton("*"); // Button for multiplication
        b4 = new JButton("/"); // Button for division
        l1 = new JLabel("First Number"); // Label for the first number
        l2 = new JLabel("Second Number"); // Label for the second number
        l3 = new JLabel("Result"); // Label for the result

        // Set layout and add components to the window.
        setLayout(new FlowLayout()); // Use FlowLayout, which arranges components from left to right, wrapping lines as necessary.
        add(l1); // Add the label for the first number
        add(t1); // Add the text field for the first number
        add(l2); // Add the label for the second number
        add(t2); // Add the text field for the second number
        add(l3); // Add the label for the result
        add(t3); // Add the text field for the result
        add(b1); // Add the addition button
        add(b2); // Add the subtraction button
        add(b3); // Add the multiplication button
        add(b4); // Add the division button

        // Add action listeners for buttons. This is where we specify what should happen when each button is clicked.
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Perform addition
                int a = Integer.parseInt(t1.getText()); // Get the text from the first text field, convert it to an integer
                int b = Integer.parseInt(t2.getText()); // Get the text from the second text field, convert it to an integer
                int c = a + b; // Perform the addition
                t3.setText(String.valueOf(c)); // Display the result in the third text field
            }
        });
        // The action listeners for the other buttons are similar, but perform different calculations.
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Perform subtraction
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                t3.setText(String.valueOf(c));
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Perform multiplication
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                t3.setText(String.valueOf(c));
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Perform division
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                t3.setText(String.valueOf(c));
            }
        });
    }

    public static void main(String[] args) {
        // Create and display the calculator
        CalculatorSwing c = new CalculatorSwing(); // Create a CalculatorSwing object
        c.setSize(400, 400); // Set the size of the window
        c.setVisible(true); // Make the window visible
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify that the program should exit when the window is closed
    }
}
