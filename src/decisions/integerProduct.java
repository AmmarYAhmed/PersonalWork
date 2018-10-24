package decisions;

import java.util.Scanner;

public class integerProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Give me a number (9999 to quit)");
		int num = input.nextInt();
		

		while (num != 9999) {
			
			System.out.println("The magic number is " + num*17);
			
			System.out.println("Give me a number (9999 to quit)");
			 num = input.nextInt();
		}
	}

}
