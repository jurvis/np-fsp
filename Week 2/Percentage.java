import java.util.Scanner;
public class Percentage {

	public static void main (String[] args) {
		// declare numbers
		double number1, number2;

		//receive input
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		// calculate & print
		double calculatedPercentage = (number1/number2 * 100);
		System.out.println(calculatedPercentage + "%");
	}
}
