package decisions;

import java.util.Scanner;
public class counter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite number?");
		int num=input.nextInt();
		int counter = 0;
		for(counter=num;)
		{
			System.out.println(counter + " Hello");
		}
	}

}
