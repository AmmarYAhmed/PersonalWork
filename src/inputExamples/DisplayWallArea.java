package inputExamples;

import java.util.Scanner;

public class DisplayWallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int WallHeight = 8;
		Scanner input = new Scanner (System.in);
		int WallWidth = 78;
		System.out.println("The wall is 8 feet tall, how wide would you like the wall to be?");
		WallWidth = input.nextInt();
		int WallArea = WallHeight * WallWidth;
		System.out.println("The area of the wall is " + WallArea + " feet squared");
		
		
	}

}
