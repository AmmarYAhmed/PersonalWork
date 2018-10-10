package OOP;

public class Worker {

	private int hoursWorked;
	private double payRate;


	public Worker()
	{
		hoursWorked = 32;
		payRate = 43.10;
	}
	
	public int getHoursWorked()
	{
		return hoursWorked;
	}
	
	public double getpayRate()
	{
		return payRate;
	}
	
	public void setHoursWorked(int bob)
	{
		hoursWorked = bob;
	}
	
	public void setHoursWorked(double bob)
	{
		payRate = bob;
	}
	
	public double payCheck()
	{
		return hoursWorked*payRate;
	}
	
	public void raise(double bob)
	{
		payRate = payRate+bob;
	}
	
	}