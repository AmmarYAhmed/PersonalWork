package inputExamples;

import java.util.Scanner;

public class YearsUntilVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 5;
		Scanner input = new Scanner (System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		int YearsUntilVote= 18 - age;
		System.out.println("It will be " + YearsUntilVote + " years until you can vote");
	}

}
