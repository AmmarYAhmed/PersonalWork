package strings;

import java.util.Scanner;
public class numberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Sentence?");
		String sentence = input.nextLine();
		int vowels = 0;
		int cons = 0;
		int punct = 0;
		for (int i=0; i<sentence.length(); i++)
		{
			if (sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u' || sentence.charAt(i)=='y')
			{
				vowels++;
			}
			else
			{
				cons++;
			}
		}
		
		System.out.println("Vowels: " +vowels);
		System.out.println("Consonants: " +cons);
	}

}
