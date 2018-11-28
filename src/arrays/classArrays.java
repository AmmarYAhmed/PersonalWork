package arrays;

import java.util.Random;

public class classArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random measure = new Random();
		int max = 56;
		int min = 10;
		int length = min + measure.nextInt (max - min + 1);
		int width = min + measure.nextInt (max - min + 1);
		Rectangle[] shapes = new Rectangle[100];
		for (int n = 0; n<=99; n++)
		{
			length = min + measure.nextInt (max - min + 1);
			width = min + measure.nextInt (max - min + 1);
			shapes[n] = new Rectangle(length, width);
		}
		for (int n = 0; n<=99; n++)
		{
		System.out.println("Rectangele " + (n+1));
		System.out.println("Length: " + shapes[n].getLength());
		System.out.println("Width: " + shapes[n].getWidth());
		System.out.println("Area: " + shapes[n].area());
		System.out.println(" ");
		}
		int smallestArea = shapes[0].area();
		int smallestIndex = 0;
		for (int n =1; n<100; n++)
		{
			if (smallestArea>shapes[n].area())
			{
				smallestArea = shapes[n].area();
				smallestIndex = n;
			}
		}
		System.out.println("smallest area: " + smallestArea);
		System.out.println("smallest index: " + smallestIndex);
	}

}
