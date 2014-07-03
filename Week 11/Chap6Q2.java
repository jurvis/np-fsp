import java.util.Scanner;
public class Chap6Q2 {

	public static void convertToFahrenheit() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius: ");
		double c = s.nextDouble();
		double f = (9.0/5) * c + 32;

		System.out.printf("The temperature in Fahrenheit is: %.1f", f);
	}

	public static void convertToCelsius() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit: ");
		double f = s.nextDouble();
		double c = (5.0/9) * (f - 32);

		System.out.printf("The temperature in Celsius is: %.1f", c);
	}

	public static void displayTempTable() {
		System.out.printf("Celsius\tFahrenheit\n");
		for (int i = 0; i <= 100; i++) {
			double f = (9.0/5) * i + 32;
			System.out.printf("%d\t%.1f\n", i, f);
		}
	}

	public static void displayMenu() {
		System.out.println("Main Menu");
		System.out.println("1) Convert from Celsius to Fahrenheit");
		System.out.println("2) Convert from Fahrenheit to Celsius");
		System.out.println("3) Display the Temperature Table");
		System.out.println("4) Exit");
		return;
	}

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 5;

		while (choice != 4) {
			displayMenu();
			System.out.print("Enter option: ");
			choice = s.nextInt();
			switch (choice) {
				case 1: convertToFahrenheit(); break;
				case 2: convertToCelsius(); break;
				case 3: displayTempTable(); break;
				default: break;
			}
		}
	}
}
