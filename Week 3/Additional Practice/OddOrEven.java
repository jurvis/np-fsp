import java.util.Scanner;
public class OddOrEven {

	public static void main (String[] args) {
		int number;

		Scanner input =  new Scanner(System.in);
		System.out.print("Enter a random integer: ");
		number = input.nextInt();

		if (number % 2 == 0) {
			System.out.print("The number is Even");
		} else {
			System.out.print("The number is Odd");
		}
	}
}
