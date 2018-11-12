package randomNumbers;

import java.util.Random; //must import the random class to generate random numbers
public class randomNumbersIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random ();
		int min = 0; //minimum value
		int max = 100; //maximum value
		
		int num = min + generator.nextInt(max - min + 1);
		
		System.out.println("A random number between " + min + " and " + max + " is " + num);
	}

}
