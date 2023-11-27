import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingPalindrome {
    // Function to check if a given string is a palindrome
    public static Boolean palindrome(String c) {
        int l = c.length();
        for (int i = 0; i < l; i++) {
            if (c.charAt(i) != c.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        System.out.println("Enter Filename:");
        String filename = P.nextLine();
        File f = new File(filename);

        try {
            // Create a new file or check if it already exists
            if (f.createNewFile()) {
                System.out.println("File Created at:" + f.getAbsolutePath());
            } else {
                System.out.println("File already exists/created");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            String str;
            // Open a FileOutputStream to write to the file
            FileOutputStream fos = new FileOutputStream(filename);
            System.out.println("Enter String to input into file:");
            str = P.nextLine();
            // Write the user-input string to the file
            for (int i = 0; i < str.length(); i++) {
                fos.write(str.charAt(i));
            }
            fos.close(); // Close the FileOutputStream after writing the content
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            // Open a FileInputStream to read from the file
            FileInputStream fis = new FileInputStream(filename);
            StringBuilder s = new StringBuilder();
            while (true) {
                int c = fis.read();
                if (c == -1) {
                    break;
                } else {
                    char c1 = (char) c;
                    s.append(c1);
                }
            }
            // Close the FileInputStream after reading the content
            fis.close();

            // Check if the content in the file is a palindrome
            if (palindrome(s.toString())) {
                System.out.println("File content is palindrome");
            } else {
                System.out.println("File content is not palindrome");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
