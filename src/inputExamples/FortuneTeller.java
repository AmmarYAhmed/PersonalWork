package inputExamples;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 5;
		Scanner input = new Scanner (System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		
		int weight = 5;
		System.out.println("What is your weight?");
		weight = input.nextInt();
		
		int LuckyNumber = 5;
		System.out.println("What is your lucky number?");
		LuckyNumber = input.nextInt();
		
		System.out.println("You will die tomorrow");
	}

}
