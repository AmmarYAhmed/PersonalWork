package arrays;
import java.util.ArrayList;
import java.util.Random;
public class arrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int max = 70;
		int min = 50;
		ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();
		for(int j=0; j<=400; j++)
		{
			int length =  min + generator.nextInt (max - min + 1);
			int width =  min + generator.nextInt (max - min + 1);
			shapes.add(new Rectangle(length,width));
		} 
		Rectangle gone = shapes.remove(shapes.size()-1);
		shapes.set(0, gone);
		System.out.println(gone.getLength());
		for(int j=399; j>=0; j--)
		{
			System.out.print("Rectangle " + (j+1) + ": " );
			System.out.print(shapes.get(j).getLength());
			System.out.print(", " + shapes.get(j).getWidth());
			System.out.println();
		}
	}

}
