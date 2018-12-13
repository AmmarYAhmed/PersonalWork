package arrays;

import java.util.Random;
import java.util.Scanner;
public class randomWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random word = new Random(726);
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int min = 0;
		int max = words.length-1;
		int result = min + word.nextInt (max - min + 1);
		System.out.println(words[result]);
	}

}
