package OOP;

public class Greeter{
	
//instance fields - data storage (There is no instance field in this program)
private int age;	
	
//default constructor
	public Greeter()
	{
		//Statements to initialize the state of the object
	}
	public Greeter(int xAge)
	{
		age = xAge;
	}
	//methods - things the object can do
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int bob)
	{
		age = bob;
	}
}
