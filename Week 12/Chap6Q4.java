import java.util.Scanner;
public class Chap6Q4 {
	public static void main (String[] args) {
		// display a list first
		displayList();
		// add a checker so we can loop over with a while loop if item code is invalid
		boolean checker = false;

		while (checker == false) {
			// declares variables and Scanner object
			int itemCode, quantity;
			Scanner input = new Scanner(System.in);

			// receive input
			System.out.print("Enter item code: ");
			itemCode = input.nextInt();
			System.out.print("Enter quantity: ");
			quantity = input.nextInt();

			// check if item string returned is null (since default returns a String value of null)
			if (getItem(itemCode) != null) {
				displayTotal(itemCode, quantity);
				checker = true;
			} else {
				System.out.println("You have input an invalid code...");
			}
		}
	}

	public static void displayTotal(int itemCode, int quantity) {
		// get data
		String itemName = getItem(itemCode);
		double price = getPrice(itemCode, quantity);
		double gst = calculateGST(price);
		double total = calculateTotal(price, gst);

		// print data
		System.out.printf("Details:\t%d\t%s\t$%d x %d = %.1f\n", itemCode, itemName, getPrice(itemCode, 1), quantity, price);
		System.out.printf("Total amount = $%.2f + $%.2f (GST) = $%.2f", price, gst, total);
	}

	// return the price of an item by taking in both itemCode and quanitity
	public static int getPrice (int itemCode, int quantity) {
		// initalize price
		int price = 0;
		// match item code to price
		switch (itemCode) {
			case 1101: price = 948 * quantity; break;
			case 1102: price = 530 * quantity; break;
			case 1103: price = 799 * quantity; break;
			case 1104: price = 890 * quantity; break;
			case 1105: price = 670 * quantity; break;
		}
		return price;
	}

	// return item name by taking in the item code and matching it
	public static String getItem (int itemCode) {
		String productName = "";
		switch (itemCode) {
			case 1101: productName = "iPhone 5"; break;
			case 1102: productName =  "Nokia Lumia 800"; break;
			case 1103: productName =  "Sony Xperia S"; break;
			case 1104: productName =  "Samsung Galaxy S3"; break;
			case 1105: productName =  "Samsung Galaxy Note"; break;
			// default to null for checker in main method
			default: productName = null; break;
		}
		return productName;
	}

	// calculates GST by taking in a price of type double multiplied by 7%
	public static double calculateGST(double price) {
		double gst  = price * 0.07;
		return gst;
	}

	// calculates total by taking in total price plus GST
	public static double calculateTotal (double price, double gst) {
		double total  = price + gst;
		return total;
	}

	//b
	public static void displayList() {
		System.out.printf("Code\tItem\tPrice ($)\n");
		// hardcode looping so you won't have to write 5 ugly print statements.
		for (int i = 1101; i < 1106; i++) {
			System.out.printf("%d\t%s\t%d\n", i, getItem(i), getPrice(i, 1));
		}
	}

}
