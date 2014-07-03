import java.util.Scanner;
public class DisplayDigit_alt {
	
	public static void main(String[] args) {
		int inputNumber;


		Scanner input =  new Scanner(System.in);
		System.out.print("Please enter a number: ");
		inputNumber = input.nextInt();

		while (inputNumber > 0) {
			System.out.print(inputNumber  + "   ");
			inputNumber /= 10;
		}
	}
}
