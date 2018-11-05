package loops;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int num2 = 0;

		for(num = 1; num <=5; num++ )
		{
			for (num2 = 1; num2 <= 10; num2++)
			{
				System.out.print(num * num2 + "	");
			}
			System.out.println();
		}
	}

}
