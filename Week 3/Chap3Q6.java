import java.util.Scanner;
public class Chap3Q6 {

	public static void main (String[] args) {
		double investment, interestRate;
		int years;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter principal investment: ");
		investment = input.nextDouble();
		System.out.print("Interest Rate: ");
		interestRate = input.nextDouble() / 100;
		System.out.print("Enter number of years: ");
		years = input.nextInt();

		double futureValue = investment * Math.pow(1 + interestRate, years);

		System.out.printf("The future value will be: %.3f", futureValue);
	}
}
