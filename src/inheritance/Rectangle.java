package inheritance;

public class Rectangle extends Quadrilateral{
	Quadrilateral bob = new Quadrilateral();
	public Rectangle ()
	{

	bob.setSide1(2);
	bob.setSide2(2);
	bob.setSide3(4);
	bob.setSide4(4);
	}

	public Rectangle (double length, double width)
	{
		bob.setSide1(length);
		bob.setSide2(length);
		bob.setSide3(width);
		bob.setSide4(width);
	}
	
	public double area ()
	{
		return bob.getSide1()*bob.getSide4();
	}
}
