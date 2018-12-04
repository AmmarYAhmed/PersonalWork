package arrays;

import java.util.Scanner;
public class multiDimensionalStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String name = "";
		String[][] names = new String[4][3];
		for (int row = 0; row<names.length; row++)
		{
		 for (int column = 0; column<names[0].length; column++ )
		 {
			System.out.println("give name");
			name = input.nextLine();
			names[row][column] = name;
		 }
		 
		}
		for (int row = 0; row<names.length; row++)
		{
		 for (int column = 0; column<names[0].length; column++ )
		 {
			System.out.println(names[row][column].length());
		 }
		 
		}
	}

}
