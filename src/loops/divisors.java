package loops;

import java.util.Scanner;
public class divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int limit = 0;
		int number = 0;
		int divisors = 0;
		
		while (limit != 9999)
		{
			
			divisors = 0;
			System.out.println("Gimme a positive number (9999 to quit)");
			limit = input.nextInt();
			if (limit == 9999)
			{
				System.out.println("Thanks for using the program!");
			}
			else {
		for (number = 1; number<=limit; number++)
		{
			if (limit%number==0)
			{
				divisors++;
			}
			
		}
			}
			
		System.out.println(divisors);
		}
		
	}

}
