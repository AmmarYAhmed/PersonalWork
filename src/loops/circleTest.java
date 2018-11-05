package loops;

import OOP.Circle;
import java.util.Scanner;
public class circleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int radius = 0;
		int radius2 = 0;
		int radius3 = 0;
		double largest = 0;
		
		Circle bob = new Circle();
		
		do {
			
			
			bob.setRadius(input.nextDouble());
			double circumference = bob.circumference();
			if (largest<circumference)
			{
				largest = circumference;
			}
			bob.setRadius(input.nextDouble());
			 circumference = bob.circumference();
			if (largest<circumference)
			{
				largest = circumference;
			}
			bob.setRadius(input.nextDouble());
			 circumference = bob.circumference();
			if (largest<circumference)
			{
				largest = circumference;
			}
			
		} while(radius != 9999);
		
		System.out.println(largest);
		
	}

}
