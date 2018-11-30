package arrays;

import java.util.Scanner;
public class arrayTestPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Friend[] names = new Friend[5];
		
		for (int j = 0; j < names.length; j++)
		{
			System.out.println("Friend " + (j+1));
			System.out.println("Give name");
			String n = input.nextLine();
			input.nextLine();
			System.out.println("Give age");
			int a = input.nextInt();
			input.nextLine();
			names[j] = new Friend(n,a);
		}
	}

}
