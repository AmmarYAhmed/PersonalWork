package decisions;

import java.util.Scanner;
public class shoeActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Give me two test scores");
		double test1 = input.nextDouble();
		double test2 = input.nextDouble();
		
		if (test1>test2)
		{
			System.out.println("Great job, you entered the tests in the correct order");
		}
		
	}

}
