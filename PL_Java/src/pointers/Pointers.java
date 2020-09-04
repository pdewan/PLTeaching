package pointers;
import java.awt.Point;
public class Pointers {
	public static void main (String[] args) {
		String[] anArray = 
				  new String[10];//implicit reference of allocated block

		Point p1 = new Point (0, 0);
		Point p2 = p1;
		System.out.println(p1.x + " " + p2.x);
		p1.x = 100;
		System.out.println(p1.x + " " + p2.x);
		
		(new Point(0, 0)).y = 4;
	}
}
