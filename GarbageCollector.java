import java.util.*;
class Garbage
{
  public void finalize ()
  {
    System.out.println ("Garbage Collected");
  }
}
class Garb
{
  public static void main(String args[])
  {
    Runtime r = Runtime.getRuntime ();
    long mem1, mem2, mem3;
      System.out.println ("Total Memory:" + r.totalMemory ());
      mem1 = r.freeMemory ();
      System.out.println ("Free Memory:" + mem1);
    Scanner P = new Scanner (System.in);
      System.out.println ("Enter size of an array:");
    int z = P.nextInt ();
    int A[] = new int[z];
    for (int i = 1; i < z; i++)
      {
	Garbage y = new Garbage ();
      }
    Runtime g = Runtime.getRuntime ();
    mem2 = g.freeMemory ();
    System.out.println ("Free Memory:" + mem2);
    r.gc ();
    mem3 = r.freeMemory ();
    System.out.println ("Free Memory after gc:" + mem3);
  }
}
