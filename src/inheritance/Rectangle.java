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

	public Rectangle (int xSide1, int xSide2, int xSide3, int xSide4)
	{
		bob.setSide1(xSide1);
		bob.setSide2(xSide2);
		bob.setSide3(xSide3);
		bob.setSide4(xSide4);
	}
	
	public double area ()
	{
		return bob.getSide1()*bob.getSide4();
	}
}
