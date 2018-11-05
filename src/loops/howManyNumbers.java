package loops;

import java.util.Scanner;
public class howManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		int count = 0;
		
		do {
			System.out.println("Gimme a number");
			number = input.nextInt();
			sum = sum+number;
			count++;
		} while (sum<=2018);
		System.out.println(count);
	}

}
