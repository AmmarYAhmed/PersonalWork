package inheritance;

public class Parallelogram extends Quadrilateral implements Geo{

	private double height;
		public Parallelogram()
		{
			super();
			height=4;
		}
		
		public Parallelogram (double length, double width, double height)
		{
			super(length, width, length, width);
			this.height=height;
		}
		
		public double area()
		{
			return (super.getSide2()*height);
		}
		
		public void setHeight(double newHeight)
		{
			height=newHeight;
		}
		
		public double getHeight()
		{
			return height;
		}
		
		public String toString()
		{
			return "Parallelogram: " + super.toString() + ", Height= " + height;
		}
	}


