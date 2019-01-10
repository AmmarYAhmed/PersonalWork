package interfaces;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person bob = new Teacher();
		bob.setName("Bob");
		System.out.println(bob.getAge());
		System.out.println(bob.getName());
		
		bob = new Student();
		bob.setName("Bob");
		System.out.println(bob.getAge());
		System.out.println(bob.getName());
		
	}

}
