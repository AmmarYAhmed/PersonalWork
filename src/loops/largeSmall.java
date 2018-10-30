package loops;

import java.util.Scanner;
public class largeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a test score");
		double test = input.nextDouble();
		double largest = test;
		double smallest = test;
		
		while (test != 9999)
		{
			System.out.println("Gimme a test score");
			test = input.nextDouble();
			
			if (test>largest)
			{
				largest = test;
			}
			
			if (test<smallest);
			{
				smallest = test;
			}

		}
		
		System.out.println("largest is " + largest);
		System.out.println("smallest is " + smallest);
		
	}

}
