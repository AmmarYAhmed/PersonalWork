package arrays;

import java.util.Random;
import java.util.Scanner;

public class randomTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random test = new Random();
		Scanner input= new Scanner(System.in);
		int[] tests = new int[250];
		int largest = 0;
		int min =  0;
		int max = 1000;
		
		for (int i = 0; i<tests.length; i++)
		{
		System.out.print("Test Score: ");
			tests[i] = min + test.nextInt (max - min + 1);
			System.out.print(tests[i]);
			if (tests[i]>largest)
			{
				largest = tests[i];
			}
			System.out.println();
		}
		System.out.println(largest);
		input.close();
	}

}
