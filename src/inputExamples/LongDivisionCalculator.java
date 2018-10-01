package inputExamples;

import java.util.Scanner;

public class LongDivisionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Dividend = 8;
		int Divisor = 7;
		System.out.println("What is the dividend?");
		Scanner input = new Scanner (System.in);
		Dividend = input.nextInt();
		System.out.println("What is the divisor?");
		Divisor = input.nextInt();
		System.out.println("The answer is " + Dividend/Divisor + "r" + Dividend%Divisor);
	}

}
