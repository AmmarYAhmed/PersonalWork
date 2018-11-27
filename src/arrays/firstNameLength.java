package arrays;

import java.util.Scanner;

public class firstNameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		for (int k =0; k<names.length; k++)
		{
			System.out.println("Enter a name");
			names[k] = input.nextLine();
		} 
		System.out.println("Give a length");
		int length = input.nextInt();
		int sameLength = 0;
		for (int k=0; k<names.length; k++)
		{
			int space = names[k].indexOf(' ');
			String firstName = names[k].substring(0, space-1);
			
			if (firstName.length()==length)
			{
				sameLength++;
			}
		}
		System.out.println(sameLength);
		
	}

}
