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
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixs = 0;
		
		for (int roll = 1; roll<=rolls; roll++)
		{
			side = min+die.nextInt(max-min+1);
			if (side==1)
			{
				ones ++;
			}
			if (side==2)
			{
				twos ++;
			}
			if (side==3)
			{
				threes ++;
			}
			if (side==4)
			{
				fours ++;
			}
			if (side==5)
			{
				fives ++;
			}
			if (side==6)
			{
				sixs ++;
			}
		}
		System.out.println(ones + " ones");
		System.out.println(twos + " twos");
		System.out.println(threes + " threes");
		System.out.println(fours + " fours");
		System.out.println(fives + " fives");
		System.out.println(sixs + " sixs");
	}

}
