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
		int num = 0;
		System.out.println("Number of students");
		int students = input.nextInt();
		System.out.println("Number of rolls per student");
		int rollsPerStudent = input.nextInt();
		System.out.println("Give a value");
		int value = input.nextInt();
		int times = 0;
		int [][] rolls = new int [students][rollsPerStudent];
		for (int row=0; row<rolls.length;row++)
		{
			for (int column=0; column<rolls[0].length;column++)
			{
				num = min + generator.nextInt (max - min + 1);
				rolls[row][column] = num;
				if (num==value)
				{
					times++;
				}
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
		System.out.println("Your value was rolled " + times + " times");
				
	}

}
