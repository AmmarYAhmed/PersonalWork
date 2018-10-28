package loops;

import java.util.Scanner;
public class counter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int total = 0;
		int counter = 0;
		for(counter=1; counter<=10; counter++)
		{
			total += counter;
		}
		System.out.println(total);
	}

}
