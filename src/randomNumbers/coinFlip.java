package randomNumbers;

import java.util.Random;
public class coinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random coin = new Random ();
		int min = 1;
		int max = 2;
		int flip = 0;
		int side = min + coin.nextInt (max - min + 1);
		int heads = 0;
		int tails = 0;
		
		for (flip=1; flip<=1000000000; flip++)
		{
			side = min + coin.nextInt (max - min + 1);
			if (side==1)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		
		System.out.println(heads + " heads flipped");
		System.out.println(tails + " tails flipped");
	}

}
