package interfaces;

import java.util.ArrayList;

public class moreInterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Rectangle bob= new Rectangle(5,5);
		Rectangle joe = new Rectangle(2,4);
		Circle julia = new Circle(3);
		Circle emily = new Circle(10);
		ArrayList<Shape> shapes = new <Shape>ArrayList();
		shapes.add(bob);
		shapes.add(joe);
		shapes.add(julia);
		shapes.add(emily);
		shapes.add(new Circle());
		int sum=0;
		double smallest = shapes.get(0).perimeter();
		for(Shape temp : shapes)
		{
			sum += temp.area();
			if(temp.perimeter()<smallest)
			{
				smallest = temp.perimeter();
			}
		}
		System.out.println(sum);
		System.out.println(smallest);
		*/
		
		/* Teacher bob= new Teacher();
		Teacher joe = new Teacher();
		Student julia = new Student();
		Student emily = new Student();
		ArrayList<Person> people = new <Shape>ArrayList();
		people.add(bob);
		people.add(joe);
		people.add(julia);
		people.add(emily);
		people.add(new Student());
		for(Person temp : people)
		{
			System.out.println(temp.getName());
			String name = temp.getName();
			if(name.length()>10)
			{
				System.out.println(temp.getAge());
			}
		} */
		
		Teacher bob= new Teacher();
		Teacher joe = new Teacher();
		Student julia = new Student();
		Student emily = new Student();
		ArrayList<Person> people = new <Shape>ArrayList();
		people.add(bob);
		people.add(joe);
		people.add(julia);
		people.add(emily);
		people.add(new Student());
		for(Person temp : people)
		{
			if (temp instanceof Student)
			{
				((Student) temp).outSick();
			}
		}
		for(Person temp : people)
		{
		System.out.println(temp.getName());
		}
	}

}
