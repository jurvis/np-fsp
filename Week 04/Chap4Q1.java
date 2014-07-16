import java.util.Scanner;
public class Chap4Q1 {
	public static void main(String[] args) {
		// declare scanner and request input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();

		//check if number is multiple of 3 and 5
		if (number % 5 == 0 && number  % 3 == 0) {
			System.out.println("The number is divisible by both 3 and 5");
		} else {
			System.out.println("The number is NOT divisible by both 3 and 5");
		}
	}
}
