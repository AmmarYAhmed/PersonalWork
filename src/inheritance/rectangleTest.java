package inheritance;
import java.util.ArrayList;
public class rectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Rectangle bob = new Rectangle(10,20);
		System.out.println(bob.perimeter());
		System.out.println(bob.area());
		Trapezoid frank = new Trapezoid(5,10,5,20,5);
		ArrayList<Geo> shapes = new <Geo> ArrayList();
		for(int j=0;j<3; j++)
		{
			shapes.add(new Trapezoid(5,5,5,5,5));
			shapes.add(new Rectangle(2,2));
		}
		double largest = shapes.get(1).area();
		for (Geo temp : shapes)
		{
			if (temp.area()>largest)
			{
				largest=temp.area();
			}
		}*/
		
		Parallelogram bob = new Parallelogram(10,10,10);
		bob.toString();
		
		Storage bobby = new Storage();
		
	}

}
