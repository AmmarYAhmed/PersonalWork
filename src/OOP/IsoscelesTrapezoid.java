package OOP;

public class IsoscelesTrapezoid {

	private int base1;
	private int base2;
	private int height;
	private int leg;
	
	public IsoscelesTrapezoid()
	{
		base1 = 12;
		base2 = 32;
		height = 12;
		leg= 2;
	}
	
	public IsoscelesTrapezoid(int base1, int base2, int height, int leg)
	{
		
	}
	
	public double getBase1()
	{
		return base1;
	}
	
	public double getBase2()
	{
		return base2;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getLeg()
	{
		return leg;
	}
	
	public double perimeter()
	{
		double perimeter = base1+base2+leg+leg;
		return perimeter;
	}
	
	public double area()
	{
		double area = (base1*base2)*(height/2);
		return area;
	}
	
}
