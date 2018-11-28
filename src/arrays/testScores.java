package arrays;

import java.util.Scanner;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tests = new int[10];
		Scanner input = new Scanner(System.in);
		int largest = 0;
		int smallest = 0;
		
		for (int j=0; j<tests.length; j++)
		{
			System.out.println("Give a test score");
			tests[j] = input.nextInt();
		}
	}

}
