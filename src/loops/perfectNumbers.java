package loops;

public class perfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int divide = 0;
		int divisors = 0;
		
		for (num=1; num<=1000; num++)
		{
			divide = 1;
			divisors = 0;
			for(divide=1; divide<num; divide++)
			{
				if (num%divide==0)
				{
					divisors = divisors+divide;
				}
				
			}
			if (divisors==num)
			{
				System.out.println(num);
			}
		}
	}

}
