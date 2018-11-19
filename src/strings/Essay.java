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
	public void firstName()
	{
		int space = name.indexOf(' ')+1;
		String name2 = name.substring(0,space);
		
	}
	
	
	public int numOfWords()
	{
		int spaces = 0;
		for (int times = 0; times<text.length(); times++)
		{
			if (text.charAt(times)==' ')
			{
				spaces++;
			}
		}
		return spaces;
	}
	
}
