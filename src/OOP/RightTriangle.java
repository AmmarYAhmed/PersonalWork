package OOP;

public class RightTriangle {

	private int base;
	private int height;

	public RightTriangle() {
		base = 43;
		height = 23;
	}

	public RightTriangle(int base, int height) {

	}

	public double hypot() {
		double hypot = (base * base) + (height * height);
		return hypot;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public void setBase(int bob) {
		bob = base;
	}

	public void setHeight(int bob) {
		bob = height;
	}

	public double perimeter() {
		double perimeter = (base + base) + (height + height);
		return perimeter;
	}

	public double area() {
		double area = base * height;
		return area;
	}

}
