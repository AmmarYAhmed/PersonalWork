package strings;

import java.util.Scanner;
public class primativeThenStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Age?");
		int age = input.nextInt();
		System.out.println("Height?");
		int height = input.nextInt();
		System.out.println("Weight?");
		int weight = input.nextInt();
		
		System.out.println("Name?");
		String name = input.next();
		
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(name);
	}

}
