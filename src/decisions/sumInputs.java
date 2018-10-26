package decisions;

import java.util.Scanner;

public class sumInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int counter = 0;
		int total = 0;
		for(counter=num;counter<=5;counter=counter + 1)
		{
			System.out.println("Enter a number: ");
			num = input.nextInt();
			total = total +num;
		}
	}

}
