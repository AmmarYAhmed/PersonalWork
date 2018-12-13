package arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class circleForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		ArrayList<Circle> shapes = new ArrayList<Circle>();
		for (int j=0; j<10; j++)
		{
			System.out.println("Give radius");
			shapes.add(new Circle(input.nextDouble()));
		}
		for (Circle x : shapes)
		{
			System.out.println(x.area());
		}
	}

}
