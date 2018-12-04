package arrays;

import java.util.Random;
public class friendMultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random generator = new Random();
		Friend[][] names = new Friend[18][5];
		int age = 0;
		int max = 100;
		int min = 0;
		for (int row = 0; row<names.length; row++)
		{
		 for (int column = 0; column<names[0].length; column++ )
		 {
			age = min + generator.nextInt (max - min + 1);
			names[row][column].setAge(age);
		 }
		}
		 
		for (int row = 0; row<names.length; row++)
		{
		 for (int column = 0; column<names[0].length; column++ )
		 {
			System.out.println(names[row][column].getAge());
		 }
		}
		
	}
}


