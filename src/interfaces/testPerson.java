package interfaces;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob = new Student();
		System.out.println(bob.getAge());
		bob.setName("Bob");
		System.out.println(bob.getName());
		System.out.println(bob.toString());
		
		Person frank = new Student();
		System.out.println(frank.getAge());
		frank.setName("Frank");
		System.out.println(frank.getName());
		System.out.println(frank.toString());
		
	}

}
