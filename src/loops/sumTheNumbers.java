package loops;

import java.util.Scanner;
public class sumTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Gimme a number");
		int number1 = input.nextInt();
		int number2 = 0;
		int sum = number1+number2;
		do
		{
			System.out.println("Gimme another number");
			number2 = input.nextInt();
			sum = number1+number2;
			System.out.println(sum);
			System.out.println("Gimme a number");
			number1 = input.nextInt();
			
		} while (number1 != 999);
	}

}
