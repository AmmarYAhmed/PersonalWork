 package OOP;

public class Rectangle {

private double length;
private double width;
	
	public Rectangle()
	{
	length = 23;
	width = 24;
	
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double perimeter()
	{
		double perimeter = (length*2)+(width*2);
		return perimeter;
	}
	
	public double area()
	{
		double area = length*width;
		return area;
	}
	
	
	public void setLength(double bob)
	{
		length = bob;
	}
	
	public void setWidth(double bob)
	{
		width = bob;
	}
	
}
