package arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String name = "";
		ArrayList<Friend> names = new ArrayList<Friend>();
		names.add(2, new Friend("Bob",23));
		names.add(1, new Friend("Billy",23));
		names.add(0, new Friend("Joe",23));
		
		System.out.println(names);
		/*
		for (int j = 0; j<=2; j++)
		{
			System.out.println("Give name");
			names.add(input.nextLine());
		} */
	}

}
