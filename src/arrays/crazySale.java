package arrays;

import java.util.Random;
import java.util.Scanner;
public class crazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random price = new Random(); 
		int[] prices = new int[25];
		int min = 0;
		int max = 100;
		
		for (int j=0; j<prices.length; j++)
		{
		System.out.println("Give the cost of the item");
		prices[j] = input.nextInt();
		}
		
		for (int j=0; j<prices.length; j++)
		{
			int sale = min + price.nextInt (max - min + 1);
			prices[j]= prices[j]*(sale/100);
		}
		
		for (int j=0; j<prices.length; j++)
		{
			System.out.println(prices[j]);
		}
	}

}
