package arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double largest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many employees?");
		int workers = input.nextInt();
		ArrayList<Double> wages= new ArrayList<Double>();
		
		for (int j=0; j<workers; j++)
		{
			System.out.println("wage?");
			wages.add(input.nextDouble());
		}
		for (Double x : wages)
		{
			if (x>largest)
			{
				largest = x;
			}
		}
		System.out.println(largest);
	}

}
