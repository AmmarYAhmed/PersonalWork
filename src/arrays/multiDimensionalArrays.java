package arrays;

import java.util.Random;
public class multiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int max = 100;
		int min = 0;
		int sum = 0;
		int num = min + generator.nextInt (max - min + 1);
		int [][] numbers = new int [3] [7];
		
		for (int row = 0; row<numbers.length; row++)
		{
		 for (int column = 0; column<numbers[0].length; column++ )
		 {
			num = min + generator.nextInt (max - min + 1);
			numbers[row][column] = num;
			System.out.print(numbers[row][column] + "	");
			sum += numbers[row][column];
		 }
		 System.out.println(" ");
		}
		System.out.println("Sum is " + sum);
	}

}
