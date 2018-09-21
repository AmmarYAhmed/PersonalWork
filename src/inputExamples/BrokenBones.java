package inputExamples;

import java.util.Scanner;
public class BrokenBones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumberOfBonesBroken = 222;
		Scanner input = new Scanner (System.in);
		System.out.println("How many bones have you broken?");
		NumberOfBonesBroken = input.nextInt();
		System.out.println("You have broken " + NumberOfBonesBroken + " bones.");
	}

}
