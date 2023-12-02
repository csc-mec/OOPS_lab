import java.util.Random;

class single extends Thread
{
    public void run()
    {
        System.out.println("Thread 1");
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        System.out.println("Random integer generated is :"+rand_int1);
        if (rand_int1 %2 ==0)
        {
            second obj1 = new second(rand_int1);
            obj1.start();
        }
    }
}

class second extends Thread
{
    int num;
    second(int rand)
    {
        num = rand;
    }

    public void run()
    {
        System.out.println("Second thread");
        int square = num*num;
        System.out.println("The square of the number is "+square);
        if (square%2!=0)
        {
            third obj2 = new third(square);
            obj2.start();
        }
    }
}

class third extends Thread
{
    int num;
    third(int sq)
    {
        num = sq;
    }
    public void run()
    {
        System.out.println("Third thread");
        System.out.println("The cube of the number is "+num*num*num);
    }

}

public  class multithread 
{
    public static void main(String args[])
    {
        try
        {
        boolean condition = true;
        while(condition)
        {

        single t1 = new single();
        t1.sleep(1000);
        t1.start();
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }    
}
