package strings;

import java.util.Scanner;
public class compareToPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("first word?");
		String word1 = input.nextLine();
		System.out.println("second word?");
		String word2 = input.nextLine();
		if ((word1.compareTo(word2)>0))
		{
			System.out.println("second word comes before first");
		}
		if ((word1.compareTo(word2)==0))
		{
			System.out.println("words are the same");
		}
		if ((word1.compareTo(word2)<0))
		{
			System.out.println("first word comes before second");
		}
		
	}

}
