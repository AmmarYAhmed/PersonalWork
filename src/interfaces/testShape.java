package interfaces;
import java.util.Scanner;
public class testShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Give lenth and width");
		int length = input.nextInt();
		int width = input.nextInt();
		Shape bob = new Rectangle(length, width);
		System.out.println(bob.perimeter());
		System.out.println(bob.area());
		
		System.out.println("Give a radius");
		int radius = input.nextInt();
		Shape frank = new Circle(radius);
		System.out.println(frank.perimeter());
		System.out.println(frank.area());

	}

}
