import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        //variable newNum stores the reverse of input number 
        //variable nc keeps a copy of current number 
        int digit = 0, newNum = 0,nc=n;


        while(n>0){
            digit = n%10;
            newNum = newNum*10 + digit;
            n = n/10;
        }


        if(nc == newNum){
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}