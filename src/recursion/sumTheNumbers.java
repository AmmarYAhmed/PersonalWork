package recursion;

public class sumTheNumbers {

		int sum;
		public int sumNum(int num)
		{
			
			if(num>0)
			{
				sum+=num;
			}
			return sum;
		}
		System.out.println(sumNum(5));
	}


