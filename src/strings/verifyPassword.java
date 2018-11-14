package strings;

import java.util.Scanner;
public class verifyPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your password");
		String pass = input.nextLine();
		System.out.println("Please verify your password");
		String verify = input.nextLine();
		if (pass.equals(verify))
		{
			System.out.println("passwords match");
		}
		else{
		while(!pass.equals(verify))
		{
			System.out.println("Please enter your password");
			pass = input.nextLine();
			System.out.println("Please verify your password");
			verify = input.nextLine();
		}}
	}

}
