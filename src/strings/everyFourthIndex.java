package strings;

import java.util.Scanner;
public class everyFourthIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		for (int display = 0; display < sentence.length(); display=display++)
		{
			if (sentence.charAt(display) != 'a' && sentence.charAt(display) != ' ')
			{
				System.out.println(sentence.charAt(display));
			}
		}
		
	}

}
