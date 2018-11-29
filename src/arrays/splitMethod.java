package arrays;
import java.util.Scanner;
public class splitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String keyword = input.nextLine();
		int times = 0;
		String[] letters = sentence.split(" ");
		for (int k=0;k<letters.length; k++)
		{
			if (letters[k].equals(keyword))
			{
				times++;
			}
		}
		System.out.println(times);
	}

}
