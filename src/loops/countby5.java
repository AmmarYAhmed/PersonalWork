package loops;

import java.util.Scanner;
public class countby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Gimme a number");
		Scanner input = new Scanner(System.in);
		int limit = input.nextInt();
		int number = 5;
		while(number<limit)
		{
			System.out.println(number);
			number = number+5;
			
		}
	}

}
