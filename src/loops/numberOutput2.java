package loops;

public class numberOutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int startNum=1;
		int num=0;
		for (row=1; row<=5;row++)
		{
			for (num=startNum; num<=5; num++)
			{
				System.out.print (num + "	");
			}
			System.out.print (row);
			System.out.println();
			
			startNum++;
		}
				
				
				
	}

}
