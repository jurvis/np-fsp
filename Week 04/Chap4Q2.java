import java.util.Scanner;
public class Chap4Q2 {
	public static void main(String[] args) {
		// declare variables
		double sales;

		// declare scanner
		Scanner input = new Scanner(System.in);
		// receive input
		System.out.print("Enter Month's Sales: ");
		sales = input.nextDouble();

		// check if sales is more than or equals to 10000
		if (sales >= 10000) {
			sales += 500;
			System.out.printf("Your commission is: $%.3f", (sales + sales* 0.1));
		} else {
			System.out.printf("Your commission is: $%.3f", sales * 0.05);
		}
	}

}
