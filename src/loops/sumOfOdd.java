package loops;

import java.util.Scanner;
public class sumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int number = 1;
		int limit = 0;
		
		for (number = 1; number < limit; number=number+2 )
		{
			System.out.println("Gimme a number");
		    limit = input.nextInt();
			System.out.println(number);
			
		}
	}

}
