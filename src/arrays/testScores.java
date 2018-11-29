package arrays;

import java.util.Scanner;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tests = new int[10];
		Scanner input = new Scanner(System.in);
		int largest = tests[0];
		int smallest = tests[0];
		int sum = 0;
		
		for (int j=0; j<tests.length; j++)
		{
			System.out.println("Give a test score");
			tests[j] = input.nextInt();
			sum += tests[j];
			if (largest<=tests[j])
			{
				largest=tests[j];
			}
			if (smallest>=tests[j])
			{
				smallest=tests[j];
			}
		}
		int average = sum/10;
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		System.out.println("Average: " + average);

		for (int j=0; j<tests.length; j++)
		{
		System.out.println("Test " + (j+1) + ": " + tests[j]);
		}
	}

}
