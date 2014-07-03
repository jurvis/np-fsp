// this program calculates the total amount spent on gas for any amount entered in cubic meters
import java.util.Scanner;
public class Chap4Q5 {
	public static void main (String[] args) {
		// declare variables
		double totalCost, consumption;

		//get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter gas consumption(in cubic meters): ");
		consumption = input.nextDouble();

		// compute
		if (consumption <= 100) {
			totalCost = 5;
      } else if (consumption <= 300) {
			totalCost = 5 + (consumption - 100) * 0.04;
      } else if (consumption <= 500) {
         totalCost = 5 + (200 * 0.04) + (consumption - 300) * 0.02;
      } else {
         totalCost = 5 + (200 * 0.04) + (200 * 0.02) + (consumption - 500) * 0.01;
      }

         	//output
		System.out.printf("The total cost of gas is: $%.2f", totalCost);
   }
}
