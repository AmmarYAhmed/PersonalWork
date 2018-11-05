package randomNumbers;
import java.util.Random;
public class russianFirstGraders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random height = new Random ();
		int min = 26;
		int max = 43;
		int each = 0;
		int above = 0;
		
		for (int kid = 1; kid<=248; kid++ )
		{
			each = min + height.nextInt (max - min + 1);
			if (each>36)
			{
				above++;
			}
		}
		System.out.println(above + " Russian first graders above 3 feet");
	}

}
