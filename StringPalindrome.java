import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = scanner.nextLine();

        boolean isPalindrome = true;

        for(int i=0 ; i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A palindrome");
        }
    }
}