package decisions;

import java.util.Scanner;
public class integersLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Give me an even number greater than 2");
		int limit = input.nextInt();
		int count = 0;
		while (count<=limit)
		{
			System.out.println(count);
			count=count+2 ;
		}
	}

}
