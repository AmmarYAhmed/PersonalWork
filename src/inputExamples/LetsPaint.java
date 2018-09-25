package inputExamples;

import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int RoomHeight = 8;
		double RoomLength = 38;
		double RoomWidth = 28;
		Scanner input = new Scanner (System.in);
		System.out.println("What is the length of the room?");
		RoomLength = input.nextDouble();
		System.out.println("What is the width of the room?");
		RoomWidth = input.nextDouble();
		System.out.println("The height of the room walls is " + RoomHeight + " feet.");
		System.out.println("The area of the walls are " + (RoomLength*RoomHeight) + " feet squared and " + (RoomWidth*RoomHeight) +  " feet squared." );
		double Wall1 = RoomLength*RoomHeight;
		double Wall2 = RoomWidth*RoomHeight;
		System.out.println("The area that must be painted is " + ((Wall1+Wall1)+(Wall2+Wall2)) + " feet squared.");
		int PaintCover = 150;
		System.out.println("Each paint bucket covers 150 square feet");
		System.out.println("It would take" + (((Wall1+Wall1)+(Wall2+Wall2))/PaintCover) + " buckets to cover all the walls");
	}

}
