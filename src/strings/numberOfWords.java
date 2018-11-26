package strings;

import java.util.Scanner;
public class numberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		int words = 1;
		for(int i=0; i<sentence.length(); i++)
		{
			if(sentence.charAt(i)==' ')
			{
				words++;
				
			}
		}
	}

}
