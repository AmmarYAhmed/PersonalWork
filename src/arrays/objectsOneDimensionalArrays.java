package arrays;

import java.util.Scanner;
public class objectsOneDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		for (int k =0; k<names.length; k++)
		{
			System.out.println("Enter a name");
			names[k] = input.nextLine();
		} 
		System.out.println("Give a letter");
		String word = input.next();
		char letter = word.charAt(0);
		for (int k =0; k<names.length; k++)
		{
			String name = names[k];
			int last = name.length()-1;
			char lastLetter = name.charAt(last);
			if (lastLetter==letter)
			{
				System.out.println(names[k] + " ends with your letter");
			}
		} 
	}

}
