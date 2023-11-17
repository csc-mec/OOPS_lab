import java.util.*;
abstract class Shape{
	abstract int numberofSides();
}
class Rectangle extends Shape{
	int numberofSides() {
	return 4;
}
}
class Triangle extends Shape{
	int numberofSides() {
		return 3;
	}
}
class Hexagon extends Shape{
	int numberofSides() {
		return 6;
	}
}

public class Abstract {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Hexagon h=new Hexagon();
		System.out.println("Number of sides in Rectangle:"+r.numberofSides());
		System.out.println("Number of sides in Triangle:"+t.numberofSides());
		System.out.println("Number of sides in Hexagon:"+h.numberofSides());

	}

}
