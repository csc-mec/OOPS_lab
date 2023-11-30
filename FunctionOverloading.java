// Program to demonstrate Function Overloading in Java
/*The function Area is being overloaded.*/
import java.util.*;
class Overloading
{
    void Area()
    {
        System.out.println("Displaying the Area function");
    }
    void Area(int r)
    {
        System.out.println("The area of the circle is "+(2*3.14*r));
    }
    void Area(int a , int b)
    {
        System.out.println("The area of a rectangle of length"+a+" and breath "+b+" is "+(a*b));
    }


}

class FunctionOverloading
{
    public static void main(String args[])
    {
    Overloading obj1 = new Overloading();
    obj1.Area();
    obj1.Area(5);
    obj1.Area(2,3);
    }
}