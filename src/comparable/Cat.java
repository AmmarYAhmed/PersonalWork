package comparable;

public class Cat implements Comparable<Cat>{
	private int age;
	private int sleep;

	public Cat()
	{
	age = 1;
	sleep = 12;
	}

	public Cat(int xAge, int xSleep)
	{ 
	age =xAge;
	sleep =xSleep; 
	}

	public int getAge()
	{
	return age;
	}

	public int getSleep()
	{
	return sleep;
	}

	public void setAge(int xAge)
	{
	age = xAge;
	}

	public void setSleep(int xSleep)
	{
	sleep = xSleep;
	}

	public void birthday()
	{
	age++;
	}

	public void sleepMore()
	{
	sleep++;
	}

	public void sleepless()
	{
	sleep--;
	}
	
	public int compareTo(Cat xCat)
	{
		if (Math.abs(age=xCat.getAge())<0.001)
		{
			return 0;
		}
		else
		{
			if(age<xCat.getAge())
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
	}
}