/* This program accepts 4 integers as the number of 50, 20 and 10 cents respectively
it will calculate the total value for you, but there is no error handling, if you have 0, do not leave
it empty. */
import java.util.Scanner;
public class Chap3Q3 {
	public static void main (String[] args) {
		//declare the quantity of coins as integers
		int number50cents, number20cents, number10cents, number5cents;
		// declare your scanner
		Scanner input = new Scanner(System.in);
		// receive input
		System.out.print("Enter number of 50 cents: ");
		number50cents = input.nextInt();
		System.out.print("Enter number of 20 cents: ");
		number20cents = input.nextInt();
		System.out.print("Enter number of 10 cents: ");
		number10cents = input.nextInt();
		System.out.print("Enter number of 5 cents: ");
		number5cents = input.nextInt();

		// calculate values of each coin and convert ints to double
		double totalValue = (double)(number50cents * 0.50) + (double)(number20cents * 0.20) + (double)(number10cents * 0.10) + (double)(number5cents * 0.05);
		// print
		System.out.printf("Total Value is: $%.3f", totalValue);
	}
}
