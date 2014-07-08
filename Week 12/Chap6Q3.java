import java.util.Scanner;
public class Chap6Q3 {
	public static void main (String[] args) {
		//declare variables
		double height, lowerWeight, upperWeight;
		Scanner input = new Scanner(System.in);

		// Accept input
		System.out.print("Enter a person's height (in m): ");
		height = input.nextDouble();
		System.out.print("Enter a person's lower weight (in kg): ");
		lowerWeight = input.nextDouble();
		System.out.print("Enter a person's upper weight (in kg): ");
		upperWeight = input.nextDouble();

		// call to display BMI
		displayBMITable(lowerWeight, upperWeight, height);
	}

	public static void displayBMITable(double lowerWeight, double upperWeight, double height) {
		// print row labels
		System.out.printf("Weight\tBMI\n");
		// loop through the initialized lowerWeight value and add one to it all the way till it is equal to upperWeight
		for (double i = lowerWeight; i <= upperWeight; i++) {
			System.out.printf("%.1f\t%f\n", i, calculateBMI(i, height));
		}
	}

	public static double calculateBMI(double weight, double height) {
		//formula
		double bmi = weight / (height * height);
		return bmi;
	}


}
