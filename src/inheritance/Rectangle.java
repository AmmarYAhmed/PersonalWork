package inheritance;

public class Rectangle extends Parallelogram implements Geo{
	
	public Rectangle ()
	{
	super();
	}

	public Rectangle (double length, double width)
	{
		super(length, width, length);
	}
	
	public double area ()
	{
		return super.getSide1()*super.getSide2();
	}
	
	public String toString()
	{
		return super.toString();
	}
}
