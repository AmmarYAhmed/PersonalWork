package arrays;

import java.util.Random;
import java.util.Scanner;
public class rollingDiceV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		Scanner input = new Scanner (System.in);
		System.out.println("Number of sides");
		int sides = input.nextInt();
		int min = 1;
		int max = sides;
		System.out.println("Number of students");
		int students = input.nextInt();
		System.out.println("Number of rolls per student");
		int rollsPerStudent = input.nextInt();
		int [][] rolls = new int [students][rollsPerStudent];
		for (int row=0; row<rolls.length;row++)
		{
			for (int column=0; column<rolls[0].length;row++)
			{
				sides = min + generator.nextInt (max - min + 1);
				rolls[row][column] = sides;
			}
		}
		for (int row=0; row<rolls.length;row++)
		{
			for (int column=0; column<rolls[0].length;column++)
			{
				System.out.print(rolls[row][column] + "	");
			}
			System.out.println();
		}
				
	}

}
