package strings;

import java.util.Scanner;
public class socialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Social Security? (without dashes)");
		String socialSecurity = input.nextLine();
		System.out.println(socialSecurity.substring(5,9));
		System.out.println(socialSecurity.substring(3,4));
		System.out.println(socialSecurity.substring(0,2));
	}

}
