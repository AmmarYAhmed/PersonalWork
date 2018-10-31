package loops;

import java.util.Scanner;
public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a test score");
		double test = input.nextDouble();
		double sum = test;
		double count= 1;
		
		while (test != 9999)
		{
			System.out.println("Gimme a test score");
			test = input.nextDouble();
			if (test>= 70)
			{
				sum = sum+test;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/count);
	}

}
