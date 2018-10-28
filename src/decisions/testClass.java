package decisions;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 2;
		int second = 4;
		int third = 6;
		if ((first>second)&&(first>third))
		{
			System.out.println(first);
		}
		
		if ((second>third)&&(second>first))
		{
			System.out.println(second);
		}
		
		if ((third>first)&&(third>second))
		{
			System.out.println(third);
		}
	}

}
