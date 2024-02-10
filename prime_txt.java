import java.io.*;
import java.util.*;
public class prime_txt {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try
        {
            FileWriter fw = new FileWriter("prime_int.txt");
            System.out.println("Printing all prime numbers");
            for (int i=1; i<num; i++)
            {
                int count =0;
                for(int j=2; j<i; j++)
                {
                    if (i%j == 0)
                    count= count +1;
                }
                if(count ==0)
                {
                    String s = String.valueOf(i);
                    fw.write(s+" ");
                }
                
            }
            fw.close();
            sc.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        

    }
}
