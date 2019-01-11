package inheritance;


public class Trapezoid extends Quadrilateral implements Geo{
	private double height;
	public Trapezoid ()
	{
		super();
		height=4;
	}
	
	public Trapezoid (double topSide, double bottomSide, double leftSide, double rightSide, double height)
	{
		super(leftSide, topSide, rightSide, bottomSide);
		this.height=height;
	}
	
	public double area()
	{
		return (super.getSide2()+super.getSide4()*(height/2));
	}
	
	public void setHeight(double newHeight)
	{
		height=newHeight;
	}
	
	public double getHeight()
	{
		return height;
	}
}
