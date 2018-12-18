package recursion;

public class sumOfOdd {

	
		public sumOfOdd()
		{
		
		}
		public int sumOdd(int num)
		{
			if (num>1 && num%2 != 0)
			{
				return (sumOdd(num-1));
			}
			return 1;
		}
}
