package inputExamples;

import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Radius = 7;
		System.out.println("What is the radius of the sphere?");
		Scanner input = new Scanner(System.in);
		Radius = input.nextDouble();
		System.out.println("The volume of your sphere is " + (4.0/3.0)*Math.PI*(Radius*Radius*Radius));
	}

}
