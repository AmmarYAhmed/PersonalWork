package loops;

import java.util.Scanner;
public class divisorsLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a number");
		int number = input.nextInt();
		int divisor = 0;
		int numberOfDivisors = 0;
		int largest = 0;
		
		for (number = 1; number<=1000; number++)
		{
			for (divisor=1; divisor<=number; divisor++ )
			{
				if(number%divisor==0)
				{
					numberOfDivisors++;
				}
				if(numberOfDivisors>largest)
				{
					largest = number;
				}
		}
		
		}
		System.out.println(largest);
	}

}
