package OOP;

public class testShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle bob = new Rectangle();
		bob.setLength(5);
		System.out.println(bob.getLength());
		bob.setWidth(7);
		System.out.println(bob.getWidth());
		Circle fred = new Circle();
		fred.setRadius(67);
		System.out.println(fred.getRadius());
		RightTriangle jim = new RightTriangle();
		jim.setBase(2);
		System.out.println(jim.getBase());
		jim.setHeight(2);
		System.out.println(jim.getHeight());
		IsoscelesTrapezoid john = new IsoscelesTrapezoid();
		john.setBase1(3);
		System.out.println(john.getBase1());
		john.setBase2(3);
		System.out.println(john.getBase2());
		john.setHeight(3);
		System.out.println(john.getHeight());
		john.setLeg(3);
		System.out.println(john.getLeg());
		System.out.println(bob.area());
		System.out.println(bob.perimeter());
		System.out.println(fred.area());
		System.out.println(fred.circumference());
		System.out.println(jim.area());
		System.out.println(jim.perimeter());
		System.out.println(john.area());
		System.out.println(john.perimeter());
	}

}
