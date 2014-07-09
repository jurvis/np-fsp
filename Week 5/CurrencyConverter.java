// this program accepts an exchange rate and calculates the eventual amount of money obtained between RMB and USD
import java.util.Scanner;
public class CurrencyConverter {

	public static void main (String[] args) {
		// get input
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		System.out.print("Enter 0 to convert from US to RMB, 1 to convert from RMB to USD: ");
		int selection = input.nextInt();

		// declare switch/case statement variables
		double rmb, dollar;
		// compute and print
		switch (selection) {
			case 0: 	System.out.print("Enter the dollar amount: ");
					dollar = input.nextDouble();
					rmb  = dollar * rate;
					System.out.printf("US$%.2f is %.2f yuan", dollar, rmb);
					break;
			case 1: System.out.print("Enter the RMB amount: ");
				      rmb = input.nextDouble();
				      dollar = rmb / rate;
				      	System.out.printf("%.2f yuan is US$%.2f", rmb, dollar);
				      break;
			default: System.out.print("Incorrect input");
					break;
		}
	}
}
