package arrays;

import java.util.Scanner;
public class oneDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		int[] test = new int[25000];
		int sum = 0;
		
		for (int i = 0; i<25000; i++)
		{
		System.out.print("Test Score: ");
			test[i] = input.nextInt();
			sum += test[i];
		}
		
		for (int i = 24999; i>=0; i--)
		{
		System.out.println(test[i]);
		}
		
		System.out.println("Sum: " +sum);
		input.close();
	} 

}
