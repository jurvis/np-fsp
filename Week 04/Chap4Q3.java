import java.util.Scanner;
public class Chap4Q3 {
	public static void main (String[] args) {
		// declare variables
		double a , b , c;
		double s, tmp, area;

		// declare scanner and receive input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of first side: ");
		a = input.nextDouble();
		System.out.print("Enter length of second side: ");
		b = input.nextDouble();
		System.out.print("Enter length of third side: ");
		c = input.nextDouble();

		// check if area is more than zero, if not, it cannot form a triangle
		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			System.out.println("The values can form a triangle");
		} else {
			System.out.println("The values you entered can't form a triangle");
		}
	}
}
