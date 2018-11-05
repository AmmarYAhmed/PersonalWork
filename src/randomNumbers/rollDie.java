package randomNumbers;

import java.util.Random;
public class rollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random die = new Random ();
		int min = 1;
		int max = 13;
		int multiples = 0;
		int side = 0;
		
		for (int roll = 1; roll <= 87; roll++)
		{
			side = min + die.nextInt (max - min + 1);
			if (side%3==0)
			{
				multiples++;
			}
		}
		System.out.println(multiples + " rolls that were multiples of 3");
	}

}
