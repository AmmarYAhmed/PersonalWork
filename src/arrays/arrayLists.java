package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String name = "";
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Jane");
		names.add(0, "Billy");
		System.out.println("What's your name?");
		names.add(input.nextLine());
		
		System.out.println(names);
		/*
		for (int j = 0; j<=2; j++)
		{
			System.out.println("Give name");
			names.add(input.nextLine());
		} */
	}

}
