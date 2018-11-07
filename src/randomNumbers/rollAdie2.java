package randomNumbers;

import java.util.Scanner;
import java.util.Random;
public class rollAdie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random die = new Random();
		int min = 1;
		int max = 6;
		System.out.println("How many rolls?");
		int rolls = input.nextInt();
		int side = 0;
		int ones = 0;
		
		for (int roll = 1; roll<=rolls; roll++)
		{
			side = min+die.nextInt(max-min+1);
			if (side==1)
			{
				
			}
		}
	}

}
