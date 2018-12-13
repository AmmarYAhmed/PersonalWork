package arrays;

import java.util.ArrayList;
public class arrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> students = new ArrayList<String>();
		students.add("Ammar Ahmed");
		students.add("Billy Bob");
		students.add("Frank Jim");
		students.add("joe car");
		String first = students.remove(0);
		String last = students.remove(students.size()-1);
		for(int j=0; j<students.size(); j++)
		{
			System.out.println(students.get(j));
		}
	}

}
