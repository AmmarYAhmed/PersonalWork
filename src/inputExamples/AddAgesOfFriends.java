package inputExamples;

import java.util.Scanner;

public class AddAgesOfFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageoffriend1 = 5;
		Scanner input = new Scanner (System.in);
		System.out.println("What is the age of the first friend?");
		ageoffriend1 = input.nextInt();
		int ageoffriend2 = 14;
		System.out.println("What is the age of the second friend?");
		ageoffriend2 = input.nextInt();
		int ageoffriend3 = 54;
		System.out.println("What is the age of the third friend?");
		ageoffriend3 = input.nextInt();
		int sum = ageoffriend1 + ageoffriend2 + ageoffriend3;
		System.out.println("The sum of the ages of the 3 friends is " + sum + " years");
		
	}

}
