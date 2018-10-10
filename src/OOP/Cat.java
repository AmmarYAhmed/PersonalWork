package OOP;

public class Cat {

	private int age;
	private int sleep;

	public Cat()
	{
		age = 123;
		sleep = 23;
	}
	
	public Cat(int age, int sleep)
	{
	
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getSleep()
	{
		return sleep;
	}
	
	public int birthday()
	{
		return age+1;
	}
	
	public void sleepMore()
	{
		sleep = sleep+1;
	}
	
	public void sleepLess()
	{
		sleep = sleep-1;
	}
	
}	
