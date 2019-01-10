package interfaces;

public class interfaceActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher bob = new Teacher();
		Student joe = new Student();
		bob.setName("Bob");
		bob.payMe();
		joe.setName("Joe");
		joe.outSick();
		joe.outSick();
		joe.outSick();
		
		Person john = bob;
		System.out.println(john.getAge());
		System.out.println(john.getName());
		
		john = joe;
		System.out.println(john.getAge());
		System.out.println(john.getName());
	}

}
