package OOP;

import java.util.Scanner;
public class House {

	public House()
	{
		
	}
	
	public void fillTheBox()
	{
		Scanner input = new Scanner(System.in); 
		System.out.println("What is the length of the sandbox?");
		int length = input.nextInt();
		System.out.println("What is the width of the sandbox?");
		int width = input.nextInt();
		System.out.println("What is the depth of the sandbox?");
		int depth = input.nextInt();
		System.out.println("How much sand can you transport per hour?");
		int transport = input.nextInt();
		int volume = (length*width*depth);
		System.out.println("It will take " + volume/transport + " hours to fill the sandbox.");
	}
	
	public double fillTheBox2(int length,int width,int depth, int transport)
	{
		Scanner input = new Scanner(System.in); 
		
		int volume = (length*width*depth);
		int hours = volume/transport;
		3return hours;
	}
}
