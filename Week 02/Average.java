/* A program (Average.java) that accepts three integers and outputs their average value. */
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// declare the 3 integers
		int integer1, integer2, integer3;

		//receive input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		integer1 = input.nextInt();
		System.out.print("Enter second integer: ");
		integer2 = input.nextInt();
		System.out.print("Enter third integer: ");
		integer3 = input.nextInt();

		//calculate average and print with 3 decimals
		double average = (double)(integer1 + integer2 + integer3)/3;
		System.out.printf("The average is: %.3f\n", average);
	}
}
