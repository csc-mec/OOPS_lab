import java.util.*;

public class Fibonocci {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner P = new Scanner(System.in);

        // Prompt the user to enter the limit for the Fibonacci series
        System.out.print("Enter Limit: ");
        
        // Read the user input for the limit
        int Lim = P.nextInt();

        // Close the Scanner to prevent resource leaks
        P.close();

        // Initialize the first two numbers of the Fibonacci series
        int First = 0;
        int Second = 1;

        // Print the first two numbers of the series
        System.out.print(First + " " + Second + " ");

        // Generate the Fibonacci series up to the specified limit
        for (int i = 2; i <= Lim; i++) {
            // Calculate the next Fibonacci number by adding the previous two numbers
            int C = First + Second;

            // Print the current Fibonacci number
            System.out.print(C + " ");

            // Update the values of First and Second for the next iteration
            First = Second;
            Second = C;
        }
    }
}
