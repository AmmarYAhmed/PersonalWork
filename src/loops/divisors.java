package loops;

import java.util.Scanner;
public class divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a positive number");
		int limit = input.nextInt();
		int number = 0;
		int divisors = 0;
		
		for (number = 1; number<=limit; number++)
		{
			if (limit%number==0)
			{
				divisors++;
			}
		}
		System.out.println(divisors);
	}

}
