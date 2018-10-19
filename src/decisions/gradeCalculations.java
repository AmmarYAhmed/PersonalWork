package decisions;

import java.util.Scanner;

public class gradeCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("What are your test and homework averages?");
		double testAverage = input.nextDouble();
		double homeworkAverage = input.nextDouble();
		System.out.println("Is your teacher nice?");
		boolean teacher = input.nextBoolean();
		if (teacher == true) {
			if (testAverage > homeworkAverage) {
				System.out.println(testAverage);
			} else {
				System.out.println(homeworkAverage);
			}
		}
		else {
			if (testAverage > homeworkAverage) {
				System.out.println(homeworkAverage);
			} else {
				System.out.println(testAverage);
			}
		}
	}
}
