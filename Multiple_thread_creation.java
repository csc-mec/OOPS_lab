import java.util.Random;
class thread1 implements Runnable
{
    public void run()
    {
        genrerate();
    }
    void genrerate()
    {
        boolean condition = true;
        try
        {
            
            while (condition) 
            {
            Thread.sleep(1000);
            Random r1 = new Random();
            int integer = r1.nextInt(100);
            System.out.println("Random number generated is "+integer);
            if (integer %2 == 0)                            //Thread 2 creation
            {
                thread2 t_2= new thread2(integer);
                Thread t2 = new Thread(t_2);
                t2.start();
            }
            else                                            //Thread3 creation 
            {
                thread3 t_3= new thread3(integer);
                Thread t3 = new Thread(t_3);
                t3.start();
            }
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
                       
}

class thread2 implements Runnable
{
    int num;
    thread2(int integer)
    {
        num = integer;
    }
    public void run()
    {
        for (int i=1; i<=num; i++)
        {
            if(i%2 ==0)
            System.out.println(i);
        }
    }
}

class thread3 implements Runnable
{
    int num;
    thread3(int integer)
    {
        num = integer;
    }
    public void run()
    {
        for (int i=1; i<=num; i++)
        {
            if(i%2 !=0)
            System.out.println(i);
        }
    }
}

public class Multiple_thread_creation 
{
    public static void main(String args[])    
    {
        thread1 t_1 = new thread1();
        Thread t1 =new Thread(t_1);
        t1.start();
    }
}
