import java.util.*;
class Polynomial
{
    int coeff, value;
    Polynomial(int coeff,int value)
    {
        this.coeff = coeff;
        this.value = value;
    }
    Polynomial add(Polynomial obj1)
    {
        int reult_coeff = obj1.coeff+ coeff;
        int result_value = obj1.value + value;
        Polynomial result = new Polynomial(reult_coeff,result_value);
        return result;
    }
}


public class Poly {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the coefficent and the constant of the first polynomial");
        int coeff_1 = sc.nextInt();
        int val_1 =sc.nextInt();

        Polynomial p1= new Polynomial(coeff_1, val_1);

        System.out.println("Enter the value of the coefficent and the constant of the second polynomial");
        int coeff_2 = sc.nextInt();
        int val_2 =sc.nextInt();

        Polynomial p2= new Polynomial(coeff_2, val_2);

        Polynomial p3 = p1.add(p2);

        System.out.println("The resultant coefficent is "+p3.coeff+"x+"+p3.value);
        sc.close();
    }
    
}
