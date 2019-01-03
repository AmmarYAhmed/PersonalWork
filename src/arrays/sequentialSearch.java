package arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class sequentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		/* ArrayList<Integer> sat = new ArrayList<Integer>();
		int min = 0;
		int max = 1600;
		boolean there = false;
		for (int j=0; j<1000; j++)
		{
			int score = min + generator.nextInt(max-min+1);
			sat.add(score);
		}
		
		System.out.println("Give an SAT score");
		int xScore = input.nextInt();
		
		for (int j=0; j<1000; j++)
		{
			if(xScore==sat.get(j))
			{
				there=true;
			}
			else
			{
				there=false;
			}
		}
		System.out.println(there);
		*/
		
		/* int max=499;
		int min=0;
		int times = 0;
		int[] numbers = new int[100];
		for(int j=0;j<100;j++)
		{
			int num = min+generator.nextInt(max-min+1);
			numbers[j] = num;
		}
		System.out.println("Give a number");
		int num2 = input.nextInt();
		
		for(int j=0;j<100;j++)
		{
			if(numbers[j] == num2)
			{
				times++;
			}
		}
		System.out.println(times); 
		 */
		int max=499;
		int min=0;
		int times = 0;
		ArrayList<Rectangle> blocks = new ArrayList<Rectangle>();
		for(int j=0;j<100;j++)
		{
			int l= min + generator.nextInt(max-min+1);
			int w= min + generator.nextInt(max-min+1);
			blocks.add(new Rectangle(l,w));
		}
		System.out.println("Give a number");
		int num2 = input.nextInt();
		
		for(Rectangle x : blocks)
		{
			if(x.getWidth() == num2)
			{
				times++;
			}
		}
		System.out.println(times); 
	}

}
