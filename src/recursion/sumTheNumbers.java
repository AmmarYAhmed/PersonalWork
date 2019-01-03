package recursion;

public class sumTheNumbers {

		
		public sumTheNumbers()
		{
			
		}
		public int sumNum(int num)
		{
			
			if(num>1)
			{
				return (num +sumNum(num-1));
			}
		return num;
		}
		
	}


