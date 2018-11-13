package strings;

import java.util.Scanner;
public class substringActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//substring activity 1
		Scanner input = new Scanner(System.in);
		String text = "My name is Buzz Lightyear!";
		
		for(int i=0; i<text.length();i++)
		{
			System.out.println(text.substring(i));
		}
		
		//activity 2
		//String text = "My name is Buzz Lightyear!";
		//for(int i=1; i<text.length();i++)
		//{
			//System.out.println(text.substring(0,i));
		//}
	}

}
