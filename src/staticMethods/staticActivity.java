package staticMethods;

import java.util.ArrayList;
import OOP.Greeter;

public class staticActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Greeter> ppl = new ArrayList<Greeter>();
		
		for(int j=0; j<4; j++)
		{
		ppl.add(new Greeter(5));
		}
		
		for(Greeter x : ppl)
		{
			System.out.println(x.getAge());
		}
	}

}
