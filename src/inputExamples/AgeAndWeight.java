package inputExamples;

import java.util.Scanner;

public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double age = 5.5;
		Scanner input = new Scanner (System.in);
		System.out.println("What is your age?");
		age = input.nextDouble();
		System.out.println("Your age is " + age);
		double weight = 5.5;
		Scanner input2 = new Scanner (System.in);
		System.out.println("What is your weight?");
		weight = input2.nextDouble();
		System.out.println("Your weight is " + weight);
	}

}
