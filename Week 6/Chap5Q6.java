import java.util.Scanner;
public class Chap5Q6 {
	public static void main (String[] args) {
        String confirmation;
        do {
            calculateShape();
            Scanner input2 = new Scanner(System.in);
            System.out.print("Do you want to calculate again? ");
            confirmation = input2.nextLine().toLowerCase();
        } while (confirmation.equals("yes"));

    }
    public static void calculateShape() {
        // declare variables
        double area, height;
        // request input
        Scanner input = new Scanner(System.in);
        System.out.print("What Shape?(circle, rectangle, triangle or trapezium): ");
        String tmp = input.nextLine();
        // convert input string to lowercase regardless
        String shape = tmp.toLowerCase();

        // declare new scanner object for different shapes.
        Scanner input2 = new Scanner(System.in);
        switch (shape) {
        case "circle": System.out.print("Enter radius: ");
        double r = input2.nextDouble();
        area = Math.PI * (r * r);
        System.out.println(area);
        break;
        case "rectangle": System.out.print("Enter length: ");
        double length = input2.nextDouble();
        System.out.print("Enter width: ");
        double width = input2.nextDouble();
        area = length * width;
        System.out.println(area);
        break;
        case "triangle": System.out.print("Enter base: ");
        double base = input2.nextDouble();
        System.out.print("Enter height: ");
        height = input2.nextDouble();
        area = 1/2 * base * height;
        System.out.println(area);
        break;
        case "trapezium": System.out.print("Enter upper base: ");
        double base1 = input2.nextDouble();
        System.out.print("Enter lower base: ");
        double base2 = input2.nextDouble();
        System.out.print("Enter height: ");
        height = input2.nextDouble();
        area = 1/2 * (base1 * base2) * height;
        System.out.println(area);
        break;
        default: System.out.print("Please try again and enter a valid shape.");
        }
    }
}
