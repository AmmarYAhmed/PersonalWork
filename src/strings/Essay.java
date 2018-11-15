package strings;

public class Essay {
	
	private String name;
	private String lastName;
	private String text;
	
	public Essay()
	{
		name = "Ammar Ahmed";
	}
	public void setAuthorName(String xName)
	{
		name = xName;
	}
	public void setText(String xText)
	{
		text = xText;
	}
	public String capitalLastName()
	{
		int space = name.indexOf(' ');
		
		return name.substring(space).toUpperCase();
	}
	public String firstName()
	{
		int zero = 0;
		int space = name.indexOf(' ');
		String name2 = name.substring(0,space);
		return name2;
	}
	
}
