package arrays;

import java.util.Random;
public class threeDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int [][][] numbers = new int[3][7][9];
		int max = 50;
		int min = 0;
		int num = min + generator.nextInt (max - min + 1);
		
		for (int row = 0; row<numbers.length; row++)
		{
		 for (int column = 0; column<numbers[0].length; column++ )
		 {
			for (int third = 0; third<numbers[0][0].length; third++)
			{
			num = min + generator.nextInt (max - min + 1);
			numbers[row][column][third] = num;
			System.out.print(numbers[row][column] + "	");
			}
		 }

	}
	}
}
