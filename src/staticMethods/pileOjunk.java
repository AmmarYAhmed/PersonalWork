package staticMethods;
import java.util.Random;
public class pileOjunk {

	Random generator = new Random();
	private static int idNumber;
	private int randomNum;
	int max = 100;
	int min = 10;
	
	public pileOjunk()
	{
		idNumber +=1;
		randomNum = min+generator.nextInt(max-min+1);
	}
	public static int numbers(int num1, int num2)
	{
		return num1+num2;
	}
	public void override (int randomNum)
	{
		this.randomNum = randomNum;
	}
	}


