package strings;

import java.util.Scanner;
public class lengthActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		for (int chr=0; chr<sentence.length(); chr++)
		{
			System.out.println(sentence.charAt(chr));
		}
		
	}

}
