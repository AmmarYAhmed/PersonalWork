package OOP;

public class Circle {

	private double radius;
	
	public Circle()
	{
	radius = 0;
	
	}
	
	public Circle(double radius)
	{
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double circumference()
	{
		double circumference = radius*2*Math.PI;
		return circumference;
	}
	
	public double area()
	{
		double area = (radius*radius)*Math.PI;
		return area;
	}
	
	
	public void setRadius(double bob)
	{
		radius = bob;
	}
}
