import java.util.Scanner;
public class Chap3Q5 {

	public static void main (String[] args) {
		// declare variables
		double radius, cylinderHeight, coneHeight;
		double volume, surfaceArea;

		// input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		System.out.print("Enter height of cylinder: ");
		cylinderHeight = input.nextDouble();
		System.out.print("Enter height of cone: ");
		coneHeight = input.nextDouble();

		// compute
		volume = 1/3 * Math.PI * (radius * radius) * coneHeight + Math.PI * (radius * radius) * cylinderHeight;
		surfaceArea = Math.PI * (radius * radius) + Math.PI * radius * Math.sqrt((radius * radius) + (coneHeight * coneHeight)) + 2 * Math.PI * radius * cylinderHeight;

		// output
		System.out.printf("The volume is: %.3f\n", volume);
		System.out.printf("The surface area is: %.3f", surfaceArea);
	}
}
