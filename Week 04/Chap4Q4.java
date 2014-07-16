// this program takes in your height and weight as input and calculates your BMI, telling you if you're Obese and whether your health is at risk.
import java.util.Scanner;

public class Chap4Q4 {
	public static void main(String[] args) {
		// declare variables
		double weight, height;

		// get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight(in kg): ");
		weight = input.nextDouble();
		System.out.print("Enter height(in metres): ");
		height = input.nextDouble();

		//computation
		double bmi = weight / (height * height);

		// output
		if (bmi >= 27.5) {
			System.out.print("Obese; High Risk");
		} else if (bmi >= 23.0) {
			System.out.print("Overweight; Moderate Risk");
		} else if (bmi >= 18.5) {
			System.out.print("Normal weight; low risk, healthy range");
		} else {
			System.out.print("Underweight; risk of nutritional deficiency");
		}
	}
}
