package decisions;

import java.util.Scanner;

public class largestInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Give me a double value");
		int num = input.nextInt();
		int largest = 0;
		
		while (num != 9999) {
			if (num>largest)
			{
				largest = num;
			}
			System.out.println("Give me a double value");
			 num = input.nextInt();
		}

		System.out.println("the largest number was " + largest);
	
	}

}
