package inputExamples;

import java.util.Scanner;
public class DidYouVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean VoteAnswer = false;
		Scanner input = new Scanner (System.in);
		System.out.println("Did you vote?");
		VoteAnswer = input.nextBoolean();
		System.out.println("You voted:" + VoteAnswer);
	}

}
