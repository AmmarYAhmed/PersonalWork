package loops;

import java.util.Scanner;

public class largeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a test score");
		double test = input.nextDouble();
		double largest = 0;
		double smallest = 0;

		while (test != 9999) {
			

			if (test > largest) {
				largest = test;
			}

			if (test < smallest)
				;
			{
				smallest = test;
			}
			System.out.println("Gimme a test score");
			test = input.nextDouble();
		}

		System.out.println("largest is " + largest);
		System.out.println("smallest is " + smallest);

	}

}
