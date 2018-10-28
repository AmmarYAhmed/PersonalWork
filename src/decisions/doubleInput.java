package decisions;

import java.util.Scanner;

public class doubleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Give me a double value");
		int num = input.nextInt();
		int sum = 0;

		while (num != 9999) {
			sum = sum+num;
			System.out.println("Give me a double value");
			 num = input.nextInt();
		}

		System.out.println("the sum of the numbers is " + sum);
	}

}
