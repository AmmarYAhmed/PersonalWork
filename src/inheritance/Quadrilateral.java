package inheritance;

public class Quadrilateral {
private double side1;
private double side2;
private double side3;
private double side4;

public Quadrilateral ()
{
side1 = 2.0;	
side2 = 4.0;	
side3 = 2.0;	
side4 = 4.0;	
}

public Quadrilateral (double xSide1, double xSide2, double xSide3, double xSide4)
{
	side1 = xSide1;
	side2 = xSide2;
	side3 = xSide3;
	side4 = xSide4;
}

public void setSide1 (double newSide1)
{
	side1 = newSide1;
}

public void setSide2 (double newSide2)
{
	side2 = newSide2;
}

public void setSide3 (double newSide3)
{
	side3 = newSide3;
}

public void setSide4 (double newSide4)
{
	side4 = newSide4;
}

public double getSide1 ()
{
	return side1;
}

public double getSide2 ()
{
	return side2;
}

public double getSide3 ()
{
	return side3;
}

public double getSide4 ()
{
	return side4;
}

public double perimeter ()
{
	return side1+side2+side3+side4;
}

}
