import java.util.Scanner;
public class Chap7Q2 {
	public static void main (String[] args) {
		int[] markArr = {67, 50, 77, 89, 34};
		String[] nameArr = new String[]{"Peter", "Jane", "Lucy", "John", "Patrick"};

		boolean checker = false;

		while (checker == false) {
			int selection = displayMenu();
			switch (selection) {
			case 1: displayStudentDetails(nameArr, markArr); break;
			case 2: calculateAverage(markArr); break;
			case 3: displayAboveAverage(nameArr, markArr); break;
			default: checker = true; break;
			}
		}
	}

	public static int displayMenu() {
		Scanner receiver = new Scanner(System.in);
		System.out.println("Main Menu");
		System.out.println("1) Display student names and marks");
		System.out.println("2) Calculate and display the average mark");
		System.out.println("3) Display students with marks above the average marks");
		System.out.println("0) Exit");

		System.out.print("Enter your option: ");
		int input = receiver.nextInt();

		return input;
	}

	public static void displayStudentDetails(String[] nameArr, int[] markArr) {
		System.out.printf("S/No\tName\tMark\n");
		for (int i = 0; i < markArr.length; i++) {
			System.out.printf("%d.\t%s\t%d\n", i, nameArr[i], markArr[i]);
		}
	}

	public static void calculateAverage(int[] markArr) {
		int total = 0;
		for (int i = 0; i < markArr.length; i++) {
			total += markArr[i];
		}
		double average = (double)total/markArr.length;
		System.out.printf("The average mark is %.1f\n", average);
	}

	public static void displayAboveAverage (String[] nameArr, int[] markArr) {
		System.out.println("Students who score above average: ");
		int total = 0;
		for (int i = 0; i < markArr.length; i++) {
			total += markArr[i];
		}
		double average = total/markArr.length;

		int counter = 1;
		for (int i = 0; i < markArr.length; i++) {
			if (markArr[i] > average) {
				System.out.printf("%d. %s\n", counter, nameArr[i]);
				counter++;
			}
		}
	}
}
