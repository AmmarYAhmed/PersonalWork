package arrays;

import java.util.Random;
import java.util.ArrayList;
public class rectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();
		int max = 50;
		int min = 1;
		int length =0;
		int width = 0;
		double largest = 0.0;
		for (int k=0; k<20; k++)
		{
			length = min + generator.nextInt (max - min + 1);
			width = min + generator.nextInt (max - min + 1);
			shapes.add(new Rectangle(length,width));
			if (largest)
		}
		
	}

}
