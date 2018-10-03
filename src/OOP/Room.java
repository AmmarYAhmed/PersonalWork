package OOP;

import java.util.Scanner;
public class Room {

	public void area()
	{
		double wallHeight = 43;
		double wallWidth = 45;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the wall?");
		wallHeight = input.nextDouble();
		System.out.println("What is the width of the wall?");
		wallWidth = input.nextDouble();
		System.out.println("The area of the wall is " + wallHeight*wallWidth);
	}	
	
	public void areaWithDoor()
	{
		double wallHeight = 43;
		double wallWidth = 45;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the wall?");
		wallHeight = input.nextDouble();
		System.out.println("What is the width of the wall?");
		wallWidth = input.nextDouble();
		double wallArea = wallWidth*wallHeight;	
		
		double doorHeight = 43;
		double doorWidth = 45;
		System.out.println("What is the height of the door?");
		doorHeight = input.nextDouble();
		System.out.println("What is the width of the door?");
		doorWidth = input.nextDouble();
		System.out.println("The area os the wall without the door is " + (wallArea-(doorHeight*doorWidth)));
	}
	
}
