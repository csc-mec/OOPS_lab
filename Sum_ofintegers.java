import java.io.*;

public class Sum_ofintegers
{
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader("integers.txt");
            FileWriter fw = new FileWriter("sum.txt");
            int digit = fr.read();
            int sum=0;
            int total_sum =0;
            while(digit!= -1)
            {
                if(digit == (int)' ')
                {
                    //completed number
                    fw.write(sum +" ");
                    total_sum = total_sum+sum;
                    sum=0;
                }
                else
                {
                    //single digit extracted
                    String s = String.valueOf((char)digit);
                    int single = Integer.parseInt(s);
                    sum = sum*10+single;
                }
                digit = fr.read();
            }
            fw.write("\n The sum of all numbers in the file is "+total_sum);
            fw.close();
            fr.close();
            System.out.println("File operations complete");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}